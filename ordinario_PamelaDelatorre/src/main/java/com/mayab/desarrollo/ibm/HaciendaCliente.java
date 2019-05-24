
package com.mayab.desarrollo.ibm;


public class HaciendaCliente implements PersonaFacturacion {
    
    String nombre;
    String apellido;
    
    public HaciendaCliente(){
        this.nombre = "nombre";
        this.apellido = "apellido";
    }
    
    public HaciendaCliente(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String nombre() {
        return this.nombre;
    }

    public String apellido() {
        return this.apellido;
    }

    
}
