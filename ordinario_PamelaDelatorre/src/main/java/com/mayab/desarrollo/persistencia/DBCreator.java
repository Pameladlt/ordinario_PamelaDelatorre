
package com.mayab.desarrollo.persistencia;

public abstract class DBCreator {
   
   public abstract Object createNotification(String base);
    
    public Object whichOne(String base){
        
        Object object = createNotification(base);
        
        return object;
        
    }
    
}
