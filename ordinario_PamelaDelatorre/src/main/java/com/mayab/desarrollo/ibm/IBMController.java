
package com.mayab.desarrollo.ibm;


public class IBMController {
    
     public static void main(String[] args) {
        
   PersonaAntiguo cliente = new Cliente();
   PersonaFacturacion hacienda = new HaciendaCliente();
   PersonaFacturacion p1 = new HaciendaAdapter(cliente);
   
   System.out.println("Antes sin hacienda " + cliente.nombre());
   System.out.println("Forma correcta segun hacienda");
   System.out.println("Nombre: " + hacienda.nombre() + " Apellido: " + hacienda.apellido());
   System.out.println("Aplicando Adapter");
   System.out.println("Nombre: " + p1.nombre() + " Apellido: " + p1.apellido());
   
   
   
    
   
   
   
        
    }
}
