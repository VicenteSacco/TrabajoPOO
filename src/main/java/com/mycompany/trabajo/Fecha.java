package com.mycompany.trabajo;

import java.util.ArrayList;

public class Fecha {
    //Atributos
    private String fecha;
    public ArrayList<ProductoSano> ListaProductoSano = new ArrayList<ProductoSano>();
    public ArrayList<ProductoNoSano> ListaProducto = new ArrayList<ProductoNoSano>();

    public Fecha() {
    }
    
    public Fecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }    
    
    public void ImprimirProducto(){
        for(int i = 0 ; i < ListaProducto.size() ; i++){
            System.out.println("=====ListaProductos=====");
            System.out.println("Nombre: "+ListaProducto.get(i).getNombre());
            System.out.println("Calorias: "+ListaProducto.get(i).getCalorias());
            System.out.println("Cantidad: "+ListaProducto.get(i).getCantidad());
        }
    }
    
    public void EliminarProducto(String nombre){
        for(int i=0; i<ListaProducto.size(); i++){
            if(nombre.equals(ListaProducto.get(i).getNombre())){
                ListaProducto.remove(i);
                break;
            }
        }
    }
    
    public void ModificarProducto(String nombreActual, String nombreNuevo, int calorias, int cantidad, int sellos){
        for(int i = 0 ; i < ListaProducto.size(); i++){
            if(nombreActual.equals(ListaProducto.get(i).getNombre())){
                ListaProducto.get(i).setNombre(nombreNuevo);
                ListaProducto.get(i).setCalorias(calorias);
                ListaProducto.get(i).setCantidad(cantidad);
                ListaProducto.get(i).setSellos(sellos);
            }
        }
    }
  
    public ProductoNoSano EncontrarProducto(String nombre){
        for(int i = 0 ;i<ListaProducto.size();i++){
            if(nombre.equals(ListaProducto.get(i).getNombre()))
                return ListaProducto.get(i);
        }
        return null;
    }
    
}