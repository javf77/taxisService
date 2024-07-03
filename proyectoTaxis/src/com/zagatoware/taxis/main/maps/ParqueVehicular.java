public class ParqueVehicular {

    /*

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

    */
   protected int id;
   protected String numeroSerie;
   protected int numeroEco;
   protected String placas;
   protected int idMarca;
   protected int idModelo;
   protected Date fechaalta;
   protected int idStatus;
   protected Modelo modelo;
   protected StatusParqueVehicular status;
   protected ArrayList<Kilometraje> kilometrajes;

   public void ParqueVehicular (){

   }
   public void ParqueVehicular (int id, String numeroSerie,int numeroEco, String placas, int IdModelo, Date FechaAlta, int idStatus)
   {

        this.id =id;
        this.numeroSerie=numeroSerie;
        this.numeroEco=numeroEco;
        this.placas = placas;
        this.idModelo = IdModelo
        this.fechaalta= FechaAlta;
        this.idStatus = idStatus;
        super();

   }
   public void ParqueVehicular (int id, String numeroSerie,int numeroEco, String placas, int IdModelo, Date FechaAlta, int idStatus, Modelo modelo,StatusParqueVehicular status)
   {

        this.id =id;
        this.numeroSerie=numeroSerie;
        this.numeroEco=numeroEco;
        this.placas = placas;
        this.idModelo = IdModelo
        this.fechaalta= FechaAlta;
        this.idStatus = idStatus;
        this.modelo = modelo;
        this.status = status;
         super();
   }
   public void setId (int id){
    this.id=id;
   }
   public int getId (){
    return this.id;
   }
   public void setNumeroSerie (String numeroSerie){
        this.numeroSerie = numeroSerie;
   }
   public String getNumeroSerie (){
        return this.numeroSerie;
   }
   public void setNumeroEco (int numeroEco){
        this.numeroEco=numeroEco;
   }
   public int getNumeroEco (){
    return this.numeroEco;
   }
   public void setPlacas (String placas){
    this.placas=placas;
   }
   public String getPlacas (){
    return this.placas;
   }
   public void setIdModelo (int idModelo){
    this.idModelo=idModelo;
   }
   public int getIdModelo (){
    return this.idModelo;
   }
   public void setModelo (Modelo modelo){
    this.modelo = modelo;
   }
   public Modelo getModelo {
    return this.modelo;
   }
   public void setFechaAlta (Date fechaAlta){
        this.fechaAlta=fechaAlta;
   }
   public Date getFechaAlta (){
        return this.fechaAlta;
   }
   public void setIdStatus (int idStatus){
        this.idStatus=idStatus;
   }
   public int getIdStatus (){
    return this.idStatus;
   }
   public void setStatusParqueVehicular(StatusParqueVehicular status){
        this.status=status;
   }
   public StatusParqueVehicular getStatus (){

        return this.status;
   }

   
   public String toString(){
        return "id = "+this.id+
        "\t Numero Serie="+this.numeroSerie+
        "\t NumeroEco="+this.numeroEco+
        "\t Placas="+this.placas+
        "\t idModelo="+this.idModelo+
        "\t Modelo=("+this.modelo.toString()+")"+
        "\t Fecha Alta="+this.fechaAlta+
        "\t IdStatus="+this.idStatus+
        "\t Status=("+this.status.toString()+")";
   }
   public ArrayList<Kilometraje> getKilometraje (){
        return this.kilometraje;
   }
}