

package com.mayab.desarrollo.ibm;

public class Cliente implements PersonaAntiguo{

    String nombre;
    
    //Constructor
     public Cliente(String nombre){
     this.nombre = nombre;
        
    }
     
     //Constructor predeterminado
    public Cliente(){
        this.nombre = "Pamela Torre";
    }
    
    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = "pamela torre";
    }

    public String nombre() {
        return this.nombre;
    }

   
    
}