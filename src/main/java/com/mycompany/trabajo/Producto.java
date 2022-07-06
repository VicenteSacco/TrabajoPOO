package com.mycompany.trabajo;

public abstract class Producto {
    //Atributos
    private String nombre;
    private int cantidad;
    private int calorias;

    public Producto(String nombre, int cantidad, int calorias) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.calorias = calorias;
    }
     public Producto() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    
    // metodo astracto 
    public abstract int CalcularCalorias();

}
