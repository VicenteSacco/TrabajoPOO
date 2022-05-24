package com.mycompany.trabajo;

abstract class Producto{
    //Atributos
    private String nombre;
    private int cantidad;
    private int calorias;

    //Constructores
    public Producto() {
    }

    public Producto(String nombre, int cantidad, int calorias) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.calorias = calorias;
    }

    //Accesores(Getters)
    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCalorias() {
        return calorias;
    }

    //Mutadores(Setters)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    
    public abstract void descripcionProducto();
    public abstract void crearProducto();
    public abstract void CalcularCaloriasTotales();
    public abstract void AlimentosMasCalorico();

}