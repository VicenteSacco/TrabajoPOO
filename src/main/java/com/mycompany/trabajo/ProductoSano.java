package com.mycompany.trabajo;

public class ProductoSano extends Producto{
    private boolean vegan;

    public ProductoSano(String nombre, int cantidad, int calorias) {
        super(nombre, cantidad, calorias);
    }
    public ProductoSano() {
        
    }
    

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }
    

    @Override
    public int CalcularCalorias() {
        int calorias = 0;
        
        return calorias;
    }
    
    
}
