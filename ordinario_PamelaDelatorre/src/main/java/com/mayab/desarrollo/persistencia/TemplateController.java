
package com.mayab.desarrollo.persistencia;

public class TemplateController {
    public static void main(String[] args){
        
        DBCreator base = new DBInstance();
        
        bases db = (DBA)base.createNotification("a");
        
        db.update("Create table alumnos (nombre char(50)");
        
        db = (DBB) base.createNotification("b");
        
        db.update("Create table ALUMNOS (Nombre char(50)");
        
        db = (DBC) base.createNotification("c");
        
        db.update("Create table Alumnos (nombre char(50)");
        
    }
}
