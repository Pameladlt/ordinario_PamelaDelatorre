
package com.mayab.desarrollo.persistencia;

public class TemplateController {
    public static void main(String[] args){
        
        DBCreator base = new DBInstance();
        
        bases db = (DBA)base.createNotification("a");
        
        db.update("Select From * WHEre basea = a");
        
        db = (DBB) base.createNotification("b");
        
        db.update("SeleCT FROM * baseb = B ");
        
        db = (DBC) base.createNotification("c");
        
        db.update("SeleCT FROM * BasEC= C");
        
    }
}
