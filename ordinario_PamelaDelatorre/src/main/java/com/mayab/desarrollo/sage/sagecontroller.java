
package com.mayab.desarrollo.sage;


public class sagecontroller {
         public static void main(String[] args) 
    {
        cliente cliente = new cliente("cliente A");
        
        //Al cliente se le asigna un observador que es el gerente
        //el cual se le va a notificar una vez que la transaccion sea mayor a 100 pesos
        
        gerente renata = new gerente("gerente Pamela",100,3, false);
        
        //Cliente se le asigna un gerente
        
        cliente.add(renata);
       
        cliente.addVenta("101");
        
        //Este no deberia de pasar
        cliente.addVenta("99");
        
        cliente.addVenta("102");
        
        System.out.println("Cambiando notificacion a SMS");
        
       renata.setEstadomsj(1);
      

        
        
    }
}
