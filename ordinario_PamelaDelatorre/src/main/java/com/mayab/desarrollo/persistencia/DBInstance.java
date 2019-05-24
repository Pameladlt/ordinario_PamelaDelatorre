
package com.mayab.desarrollo.persistencia;


public class DBInstance extends DBCreator {
    
     public Object createNotification(String base) {
        if(base.equalsIgnoreCase("a"))
            return new DBA();
        else if(base.equalsIgnoreCase("b"))
            return new DBB();
        else if(base.equalsIgnoreCase("c"))
            return new DBC();
        else 
            return null;
    }
    
}
