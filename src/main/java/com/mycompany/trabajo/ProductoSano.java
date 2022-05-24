package com.mycompany.trabajo;

import java.util.Scanner;

public class ProductoSano extends Producto{
    
    public static Fecha fecha = new Fecha();
    Scanner entrada = new Scanner(System.in);
    
    private boolean vegan;
    private String nombre;
    private int cantidad;
    private int calorias;
    
    public ProductoSano(){
    }
    public ProductoSano(String nombre,int cantidad, int calorias, boolean vegan){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.calorias = calorias;
        this.vegan = vegan;
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

    public boolean isVegan() {
        return vegan;
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

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }
  
    @Override
    public void descripcionProducto(){
        if(vegan)
          System.out.println("El Producto "+getNombre()+"ES VEGANO y tiene "+getCalorias()+" calorias.");
        
        System.out.println("El Producto "+getNombre()+"NO ES VEGANO y tiene "+getCalorias()+" calorias."); 
    }
    public void crearProducto(){
      System.out.println("Ingrese nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese calorias: ");
        calorias = entrada.nextInt();
        System.out.println("Ingrese gramos: ");
        cantidad = entrada.nextInt();
        System.out.println("Es vegano? true= Si/false= No");
        vegan = entrada.nextBoolean();

        fecha.ListaProductoSano.add(new ProductoSano(nombre,calorias,cantidad,vegan));
    }
    
    // Funcionalidades Propias. (EP4.1)
    public void CalcularCaloriasTotales(){
       int totalCalorias = 0 ;
       for(int i = 0 ; i < fecha.ListaProductoSano.size() ; i++){
           totalCalorias = fecha.ListaProductoSano.get(i).getCalorias() + totalCalorias;

       }

       System.out.println("La Cantidad De Calorias Totales Durante el dia es : " +totalCalorias);
    }
     public void AlimentosMasCalorico(){
       int alimentoMasCalorico = 0;
       String nombreMasCalorico=null;
       for(int i = 0 ; i < fecha.ListaProductoSano.size() ; i++){
       if(i == 0){
         alimentoMasCalorico = fecha.ListaProductoSano.get(i).getCalorias();
         nombreMasCalorico = fecha.ListaProductoSano.get(i).getNombre();
         continue;
       }
       if(alimentoMasCalorico < fecha.ListaProductoSano.get(i).getCalorias() ){
         alimentoMasCalorico = fecha.ListaProductoSano.get(i).getCalorias();
         nombreMasCalorico = fecha.ListaProductoSano.get(i).getNombre();
       }  


    }
       System.out.println("El Producto mas Calorico es : " +nombreMasCalorico);
  }  
}