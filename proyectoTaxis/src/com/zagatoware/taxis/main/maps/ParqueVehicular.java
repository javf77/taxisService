class ParqueVehicular {

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
   
}