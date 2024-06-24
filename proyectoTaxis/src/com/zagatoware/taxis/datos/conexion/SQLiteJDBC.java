package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteJDBC {

    private static final String URL = "jdbc:sqlite:taxis.db";
    private Connection connection = null;

    // Método para conectar a la base de datos
    public void connect() {
        try {
            connection = DriverManager.getConnection(URL);
            System.out.println("Conexión a SQLite establecida.");
        } catch (SQLException e) {
            System.err.println("No se pudo conectar a SQLite: " + e.getMessage());
        }
    }

    // Método para desconectar de la base de datos
    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión a SQLite cerrada.");
            }
        } catch (SQLException e) {
            System.err.println("No se pudo cerrar la conexión a SQLite: " + e.getMessage());
        }
    }

    // Método para ejecutar una consulta de actualización (INSERT, UPDATE, DELETE)
    public boolean executeUpdate(String sql) {
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            System.err.println("Error al ejecutar actualización: " + e.getMessage());
            return false;
        }
    }

    // Método para ejecutar una consulta de selección
    public ResultSet executeQuery(String sql) {
        try {
            Statement stmt = connection.createStatement();
            return stmt.executeQuery(sql);
        } catch (SQLException e) {
            System.err.println("Error al ejecutar consulta: " + e.getMessage());
            return null;
        }
    }

    // Método para preparar una declaración SQL
    public PreparedStatement prepareStatement(String sql) {
        try {
            return connection.prepareStatement(sql);
        } catch (SQLException e) {
            System.err.println("Error al preparar declaración: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        SQLiteJDBC db = new SQLiteJDBC();

        // Conectar a la base de datos
        db.connect();

        // Crear una tabla
        String createTableSQL = "CREATE TABLE IF NOT EXISTS users ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "username TEXT NOT NULL,"
                + "password TEXT NOT NULL"
                + ");";
        db.executeUpdate(createTableSQL);

        // Insertar datos en la tabla
        String insertSQL = "INSERT INTO users (username, password) VALUES ('admin', 'admin');";
        db.executeUpdate(insertSQL);

        // Seleccionar datos de la tabla
        String selectSQL = "SELECT * FROM users;";
        ResultSet rs = db.executeQuery(selectSQL);
        try {
            while (rs != null && rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Username: " + rs.getString("username"));
                System.out.println("Password: " + rs.getString("password"));
            }
        } catch (SQLException e) {
            System.err.println("Error al procesar los resultados: " + e.getMessage());
        } finally {
            // Asegurarse de cerrar el ResultSet
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.err.println("Error al cerrar el ResultSet: " + e.getMessage());
            }
        }

        // Desconectar de la base de datos
        db.disconnect();
    }
}
