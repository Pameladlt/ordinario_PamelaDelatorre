
package com.mayab.desarrollo.ibm;


public class HaciendaAdapter implements PersonaFacturacion{

PersonaAntiguo p;

public HaciendaAdapter(PersonaAntiguo p){
        this.p = p;
    }

 public String nombre() {
     
     String fullName = p.nombre();
     int idx = fullName.lastIndexOf(' ');
     if (idx == -1)
    throw new IllegalArgumentException("Only a single name: " + fullName);
    String firstName = fullName.substring(0, idx);
    String lastName  = fullName.substring(idx + 1);
    return firstName;
    }

    public String apellido() {
        String fullName = p.nombre();
     int idx = fullName.lastIndexOf(' ');
     if (idx == -1)
    throw new IllegalArgumentException("Only a single name: " + fullName);
    String firstName = fullName.substring(0, idx);
    String lastName  = fullName.substring(idx + 1);
    return lastName;
    }
    
    
}

