/*
CREATE TABLE "kilometraje
" (
    idParqueVehicular INTEGER
  , fecha DATETIME
  , kilometrajeInicial REAL
  , kilometrajefinal REAL
  , FOREIGN KEY(idParqueVehicular) REFERENCES parquevehicular(id) 
    ON DELETE NO ACTION 
    ON UPDATE NO ACTION
);*/

public class Kilometraje {

    protected int idParqueVehicular;
    protected Date fecha;
    protected Float kilometrajeInicial
    protected Float kilometrajefinal;

    public void setIdParqueVehicular (int idParqueVehicular){
        this.idParqueVehicular=idParqueVehicular;
    }
    public int getIdParqueVehicular (){

        return this.idParqueVehicular;
    }
    public void setFecha (Date fecha){
        this.fecha=fecha;
    }
    public Date getFecha(){
        return this.fecha;
    }
    public void setKilometrajeInicial (Float kilometrajeInicial){
        this.kilometrajeInicial=kilometrajeInicial;
    }
    public Float getKilometrajeInicial (){
        return this.kilometrajeInicial;
    }
    public void setKilometrajeFinal (Float kilometrajefinal){
       this.kilometrajefinal=kilometrajefinal;     
    }
     public Float kilometraje (){
        return this.kilometrajefinal - this.kilometrajeInicial;
    }
    public String toString(){
        return "id="+this.idParqueVehicular+
        "\t fecha="+this.fecha+
        "\t Kilometraje Inicial="+this.kilometrajeInicial+
        "\t Kilometraje Final="+this.kilometrajefinal;
    }
}