/*

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

*/


public class BitacoraStatusParqueVehicular{

    protected int id;
    protected int idParqueVehicular;
    protected int idStatusParqueVehicular;
    protected Date fecha;
    protected String observaciones;
    protected StatusParqueVehicular status;

    public void BitacoraStatusParqueVehicular(){

    }
    public void BitacoraStatusParqueVehicular (int id, int idParqueVehicular, int idStatusParqueVehicular. Date fecha, String observaciones) {
        this.id=id;
        this.idParqueVehicular=idParqueVehicular;
        this.idStatusParqueVehicular=idStatusParqueVehicular;
        this.fecha=fecha;
        this.observaciones=observaciones;       

    }

    public void BitacoraStatusParqueVehicular (int id, int idParqueVehicular, int idStatusParqueVehicular. Date fecha, String observaciones, StatusParqueVehicular statusParqueVehicular) {
        this.id=id;
        this.idParqueVehicular=idParqueVehicular;
        this.idStatusParqueVehicular=idStatusParqueVehicular;
        this.fecha=fecha;
        this.observaciones=observaciones;       
        this.status = statusParqueVehicular;    
    }
    public void setId (int id){
        this.id=id;
    }
    public int getId (){
        return this.id;
    }
    public int getIdParqueVehicular (){
        return this.idParqueVehicular;
    }
    public void setIdParqueVehicular(int idParqueVehicular){
        this.idParqueVehicular=idParqueVehicular;
    }
    public void setIdParqueVehicular (int idParqueVehicular){
        this.idParqueVehicular=idParqueVehicular;
    }
    public int getIdParqueVehicular (){
        return this.idStatusParqueVehicular;
    }
    public void setStatus (StatusParqueVehicular status){
        this.status=status;
    }
    public StatusParqueVehicular getStatus (){
        return this.status;
    }
} 