public class Modelo {

    /*
    CREATE TABLE modelo (
    id INTEGER PRIMARY KEY
  , idMarca INTEGER
  , modelo TEXT
  , FOREIGN KEY(id) REFERENCES marca(id) 
    ON DELETE NO ACTION 
    ON UPDATE NO ACTION
    );*/

    private int id;
    private int idMarca;
    private String modelo;
    private Marca marca;
    Public void Modelo (int id, int idMarca,String modelo, Marca modelo = null){

        this.id=id;
        this.idMarca=idMarca;
        this.modelo=modelo;
        this.marca = modelo;
    }

    public void setId (int id){
        this.id=id;
    }
    public int getId (){
        return this.id;
    }
    public void setIdMarca (int idMarca){
        this.idMarca=idMarca;
    }
    public int getIdMarca (){
        return this.idMarca;
    }
    public void setMarca (Marca marca){
        this.marca=marca;
    }
    public Marca getMarca (){

        return this.marca;
    }}
    public return toString ()
    {
        return "id = "+this.id+" idMarca="+this.idMarca+" Modelo = "+this.modelo+" Marca = "+this.marca.toString();
    }
}