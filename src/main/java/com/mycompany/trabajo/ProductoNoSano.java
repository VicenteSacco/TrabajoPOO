package com.mycompany.trabajo;

import java.util.Scanner;

public class ProductoNoSano extends Producto{
    
    public static Fecha fecha = new Fecha();
    Scanner entrada = new Scanner(System.in);
    
    private String nombre;
    private int cantidad;
    private int calorias;
    private int sellos;
    
    public ProductoNoSano(){    
    }
    
    ProductoNoSano(String nombre,int cantidad, int calorias, int sellos){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.calorias = calorias;
        this.sellos = sellos;
    }


  //Accesores(Getters)
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public int getCalorias() {
        return calorias;
    }
  
    public int getSellos() {
        return sellos;
    }

    //Mutadores(Setters)
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
  
    public void setSellos(int sellos) {
        this.sellos = sellos;
    }
    @Override
    public void descripcionProducto(){
         System.out.println("El Producto "+getNombre()+" tiene "+getSellos()+" Sellos y tiene "+getCalorias()+" calorias.");
    }
    @Override
    public void crearProducto(){
        System.out.println("Ingrese nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese calorias: ");
        calorias = entrada.nextInt();
        System.out.println("Ingrese gramos: ");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese cantidad sellos: ");
        sellos = entrada.nextInt();
        
        fecha.ListaProducto.add(new ProductoNoSano(nombre,calorias,cantidad,sellos));
    }
    
    // Funcionalidades Propias. (EP4.1)
    public void CalcularCaloriasTotales(){
     int totalCalorias = 0 ;
     for(int i = 0 ; i < fecha.ListaProducto.size() ; i++){
         totalCalorias = fecha.ListaProducto.get(i).getCalorias() + totalCalorias;
         
     }
      
     System.out.println("La Cantidad De Calorias Totales Durante el dia es : " +totalCalorias);
  }
  
  public void AlimentosMasCalorico(){
     int alimentoMasCalorico = 0;
     String nombreMasCalorico=null;
     for(int i = 0 ; i < fecha.ListaProducto.size() ; i++){
     if(i == 0){
       alimentoMasCalorico = fecha.ListaProducto.get(i).getCalorias();
       nombreMasCalorico = fecha.ListaProducto.get(i).getNombre();
       continue;
     }
     if(alimentoMasCalorico < fecha.ListaProducto.get(i).getCalorias() ){
       alimentoMasCalorico = fecha.ListaProducto.get(i).getCalorias();
       nombreMasCalorico = fecha.ListaProducto.get(i).getNombre();
     }  
     
    
  }
   System.out.println("El Producto mas Calorico es : " +nombreMasCalorico);
}
}