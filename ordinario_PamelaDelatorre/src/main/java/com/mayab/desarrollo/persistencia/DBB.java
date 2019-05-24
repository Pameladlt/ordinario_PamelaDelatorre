
package com.mayab.desarrollo.persistencia;

//La base de datos B todos los nombres deben aparecer en minusculas
public class DBB extends bases{
     public DBB(){
    }

    @Override
    public String crearSentencia(String sentencia) {
        return sentencia.toLowerCase();
    }
    
}
