
package com.mayab.desarrollo.sage;


public interface observable {
    
    public String getEstado();
    
    public void remove(gerente gerente);
    
    public void add(gerente gerente);
    
    public void notifyO(String venta);
    
}
