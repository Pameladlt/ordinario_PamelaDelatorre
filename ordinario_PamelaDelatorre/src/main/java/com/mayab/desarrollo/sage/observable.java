
package com.mayab.desarrollo.sage;


public interface observable {
    
    public String getEstado();
    
    public void remove(gerente pasajero);
    
    public void add(gerente pasajero);
    
    public void notifyO(String venta);
    
}