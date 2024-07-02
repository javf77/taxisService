public class StatusEgresos{

    private int  id;
    private String status;

    public void StatusParqueVehicular (int id, String status){

        this.id = id;
        this.status = status;

    }

    public int getId (){
        return this.id;
    }
    public void setId (int Id){
        this.id=id;
    }

    public void setStatus (String status){
        this.status = status
    }
    public setStatus (){
        return this.status;
    }

    public toString (){
        return "id="+this.id+"Status="+this.status;
 
    }

}