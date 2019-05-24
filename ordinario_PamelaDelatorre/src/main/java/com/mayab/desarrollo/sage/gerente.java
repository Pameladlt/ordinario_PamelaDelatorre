
package com.mayab.desarrollo.sage;

import java.util.ArrayList;

public class gerente implements observer {
    
    public String nombregerente;
    public ArrayList<String> history = new ArrayList<String>();
    public int limit;
    public int estadomsj;
    public boolean cierta;
    
    //Constructor
    
    public gerente(String nombre, int limit, int estadomsj, boolean cierta){
        this.nombregerente = nombre;
        this.limit = limit;
        //1 --> SMS
        //2 --> EMAIL
        //3 --> LOS DOS
        this.estadomsj= estadomsj;
        this.cierta = cierta;
    }
    
    
    //Getter and Setter

    public boolean isCierta() {
        return cierta;
    }

    public void setCierta(boolean ciertahora) {
        this.cierta = cierta;
    }

    
    
    
    public void setEstadomsj(int estadomsj) {
         
        if (estadomsj == 1 )
        {
            System.out.println("SMS");
            
        }
        else
            
         if (estadomsj == 2 )
        {
            System.out.println("EMAIL");
            
        }
        else
          if (estadomsj == 3 )
        {
            System.out.println("EMAIL Y SMS");
            
        }
        else
              if (estadomsj ==0)
        {
            System.out.println("NINGUNO");
            
        }
    }

    public int getEstadomsj() {
        return estadomsj;
    }

    
    

    public String getNombregerente() {
        return nombregerente;
    }

    public void setNombregerente(String nombregerente) {
        this.nombregerente = nombregerente;
    }

    public ArrayList<String> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<String> history) {
        this.history = history;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
    
    //Metodos
    
   public void update(int venta) {
            if(venta>limit){
                
                if (cierta == true )
                {
                
                if (this.estadomsj == 1)
                {
                    System.out.println("Notificacion por SMS");
                }
                    if(this.estadomsj == 2)
                    {
                        System.out.println("Notificacion por EMAIL");
                    }
                        if (this.estadomsj == 3)
                        {
                            System.out.println("Notificacion por SMS");
                            System.out.println("Notificacion por EMAIL");
                        }
                else
                        {
                            
                        }
                        
                         alert(venta);
                history.add(String.valueOf(venta));
                }
                else
                    if (cierta == false)
                    {
                        System.out.println("No se pueden enviar notificaciones");
                    }
               
            }
   
	}
	
	public void alert(int salida) {
		System.out.println(this.nombregerente + " venta por:  " + salida);
	}

    
}

