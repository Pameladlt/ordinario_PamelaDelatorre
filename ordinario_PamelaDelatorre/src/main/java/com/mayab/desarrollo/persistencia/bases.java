
package com.mayab.desarrollo.persistencia;


public abstract class bases {
    
       final public void update(String sentencia){
        
        abrirConexion();
        ejecutar(crearSentencia(sentencia));
    }
    
    public void abrirConexion(){
        System.out.println("abriendo conexion...");
    }
    
    public abstract String crearSentencia(String sentencia);
    
    public void ejecutar(String sentencia){
        System.out.println("Ejecutando sentencia: " + sentencia);
    }
    
}
