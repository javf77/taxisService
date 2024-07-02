/*
CREATE TABLE marca (
    id INTEGER PRIMARY KEY
  , marca TEXT NOT NULL
);
*/
public class Marca
{

    protected int id;
    protected String marca;

    public void Marca (int id, String marca){
        this.id=id;
        this.marca=marca;
    }
    public int setId (int id)
    {
        this.id=id;
    }
    public int getId (){return this.id;}
    public void setMarca (String marca){
        this.marca = marca;
    }
    public String getMarca (){

        return this.marca;
    }
    public String toString (){
        return "id = "+this.id+"\t Marca = "+this.marca;
    }
}