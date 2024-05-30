BEGIN;

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

COMMIT;
