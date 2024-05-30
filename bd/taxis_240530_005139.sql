PRAGMA foreign_keys = OFF;

BEGIN;

SAVEPOINT dump;

CREATE TABLE bitacoraStatusParqueVehicular (
    id INTEGER PRIMARY KEY
  , idParqueVehicular INTEGER
  , idStatusParqueVehicular INTEGER
  , fecha datetime
  , observvaciones TEXT
  , FOREIGN KEY(idParqueVehicular) REFERENCES parquevehicular(id) 
    ON DELETE NO ACTION 
    ON UPDATE NO ACTION 
    FOREIGN KEY(idStatusParqueVehicular) REFERENCES statusParqueVehicular(id) 
    ON DELETE NO ACTION 
    ON UPDATE NO ACTION
);

CREATE TABLE concepto (
    id INTEGER PRIMARY KEY
  , descripcion TEXT
);

CREATE TABLE concetoEgresos (
    id INTEGER
  , concepto TEXT
);

CREATE TABLE "egresos" (
    id INTEGER PRIMARY KEY
  , fecha datetime
  , egresos REAL
  , idConceptoEgresos INTEGER
  , otro TEXT
  , idParqueVehicular INTEGER
  , idStatusIngresos INTEGER
  , FOREIGN KEY(idConceptoEgresos) REFERENCES concetoEgresos(id) 
    ON DELETE NO ACTION 
    ON UPDATE NO ACTION 
    FOREIGN KEY(idParqueVehicular) REFERENCES parquevehicular(id) 
    ON DELETE NO ACTION 
    ON UPDATE NO ACTION 
    FOREIGN KEY(idStatusIngresos) REFERENCES statusEgresos(id) 
    ON DELETE NO ACTION 
    ON UPDATE NO ACTION
);

CREATE TABLE "ingresos" (
    id INTEGER PRIMARY KEY
  , fecha datetime
  , ingreso REAL
  , idParqueVehicular INTEGER
  , idStatusIngreso INTEGER
  , idConcepto INTEGER
  , otro TEXT
  , FOREIGN KEY(idParqueVehicular) REFERENCES parquevehicular(id) 
    ON DELETE NO ACTION 
    ON UPDATE NO ACTION 
    FOREIGN KEY(idStatusIngreso) REFERENCES statusIngreso(id) 
    ON DELETE NO ACTION 
    ON UPDATE NO ACTION 
    FOREIGN KEY(idConcepto) REFERENCES concepto(id) 
    ON DELETE NO ACTION 
    ON UPDATE NO ACTION
);

CREATE TABLE "kilometraje
" (
    idParqueVehicular INTEGER
  , fecha DATETIME
  , kilometrajeInicial REAL
  , kilometrajefinal REAL
  , FOREIGN KEY(idParqueVehicular) REFERENCES parquevehicular(id) 
    ON DELETE NO ACTION 
    ON UPDATE NO ACTION
);

CREATE TABLE marca (
    id INTEGER PRIMARY KEY
  , marca TEXT NOT NULL
);

CREATE TABLE modelo (
    id INTEGER PRIMARY KEY
  , idMarca INTEGER
  , modelo TEXT
  , FOREIGN KEY(id) REFERENCES marca(id) 
    ON DELETE NO ACTION 
    ON UPDATE NO ACTION
);

CREATE TABLE "parquevehicular" (
    id INTEGER PRIMARY KEY
  , numeroserie TEXT
  , numeroeco INTEGER
  , placas INTEGER
  , idMarca INTEGER
  , idModelo DATETIME
  , modelo INT
  , fechaalta DATE
  , idStatus INTEGER
  , UNIQUE(numeroserie) 
    UNIQUE(numeroeco) 
    UNIQUE(placas) 
    FOREIGN KEY(idMarca) REFERENCES marca(id) 
    ON DELETE NO ACTION 
    ON UPDATE NO ACTION 
    FOREIGN KEY(idModelo) REFERENCES modelo(id) 
    ON DELETE NO ACTION 
    ON UPDATE NO ACTION
);

CREATE TABLE statusEgresos (
    id INTEGER PRIMARY KEY
  , status TEXT
);

CREATE TABLE statusIngreso (
    id INTEGER PRIMARY KEY
  , statusIngreso TEXT
);

CREATE TABLE "statusParqueVehicular" (
    id INTEGER PRIMARY KEY
  , status TEXT
);

INSERT INTO statusParqueVehicular(id, status) VALUES(1, 'Activo');
INSERT INTO statusParqueVehicular(id, status) VALUES(2, 'Rentado');
INSERT INTO statusParqueVehicular(id, status) VALUES(3, 'Baja');
INSERT INTO statusParqueVehicular(id, status) VALUES(4, 'En Taller');

RELEASE dump;

COMMIT;

