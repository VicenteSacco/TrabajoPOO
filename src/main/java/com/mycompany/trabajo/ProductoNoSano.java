package com.mycompany.trabajo;

public class ProductoNoSano extends Producto{
    private int sellos;

    public ProductoNoSano(String nombre, int cantidad, int calorias) {
        super(nombre, cantidad, calorias);
    }
    public ProductoNoSano() {
        
    }
    

    public int getSellos() {
        return sellos;
    }

    public void setSellos(int sellos) {
        this.sellos = sellos;
    }
    
    @Override
    public int CalcularCalorias() {
        int calorias = 0;
        
        return calorias;
    }
    
}
