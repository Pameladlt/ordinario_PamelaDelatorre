package com.mayab.desarrollo.sage;

import java.util.ArrayList;

public class cliente implements observable {
    
    
    
    public ArrayList<String> ventas = new ArrayList<String>();
    ArrayList<gerente> gerentes = new ArrayList<gerente>();
    
    public String nombre;

    //Constructor que recibe el nombre del cliente
    public cliente(String n) {
        this.nombre = n;
    }

    @Override
    public String getEstado() {
        String estado = this.nombre + "\r\n";
        for(String string : ventas){
            estado += string + "\r\n";
        }
        return estado;
    }

    @Override
    public void remove(gerente gerente) {
        this.gerentes.remove(gerente);
    }

    @Override
    public void add(gerente gerente) {
        this.gerentes.add(gerente);
    }

    public void notifyO(String venta) {
        for(gerente gerente : gerentes){
            gerente.update(Integer.valueOf(venta));
        }
    }

    
    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getVenta() {
        return ventas;
    }

    public void addVenta(String venta) {
        this.ventas.add(venta);
        notifyO(venta);
    }

    
}
