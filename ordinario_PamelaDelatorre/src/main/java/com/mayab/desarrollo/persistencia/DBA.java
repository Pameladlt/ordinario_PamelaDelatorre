
package com.mayab.desarrollo.persistencia;

public class DBA extends bases{
     
    //La base de datos A requiere que los nombres de las tablas y las columnas que se usan
    //en la query esten todos en mayusculas 
    public DBA(){
    }

    @Override
    public String crearSentencia(String sentencia) {
        return sentencia.toUpperCase();
    }

    
}
