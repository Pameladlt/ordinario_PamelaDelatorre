
package com.mayab.desarrollo.persistencia;

//la base de datos c no importan las mayusculas o las minusculas
public class DBC extends bases{
    
     @Override
    public String crearSentencia(String conex) {
        return conex;
    }
}
