
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauro
 */
public class Producto {
  private String nombre;
  private String tipo;
  private int cantidad;
  private int calorias;
  private ArrayList<Producto>ListaProductos;
  
    //constructor
  
  
    public Producto(String nombre, String tipo, int cantidad, int calorias) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.calorias = calorias;
    }
    public Producto(){
        ListaProductos=new ArrayList<Producto>();
    }
  
    //accesores
    public ArrayList<Producto> getproducto() {
        return ListaProductos;
    }
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCalorias() {
        return calorias;
    }
    
    //mutadores
    public void setLProducto(ArrayList<Producto> Producto) {
        this.ListaProductos = Producto;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    
    //comportamietos 
   // Sobrecarga en los comportamientos indicando el producto.
    public void CrearProducto(){
      String Nombre;
      String Tipo;
      int Cantidad;
      int Calorias;
        
      Scanner Entrada=new Scanner(System.in);
      System.out.println("Inserte los siguientes datos");
      
      System.out.println("Nombre del Producto:");
      Nombre=Entrada.next();
      
      System.out.println("Tipo del Producto:");
      Tipo=Entrada.next();
      
      System.out.println("Cantidad del Producto:");
      Cantidad=Entrada.nextInt();
      
      System.out.println("Calorias del Producto:");
      Calorias=Entrada.nextInt();
       
      ListaProductos.add(new Producto(Nombre,Tipo,Cantidad,Calorias));
    }
    public void CrearProducto(String nombre){
      System.out.println("Insertar Producto");
    }

    public void LeerProducto(){
      System.out.println("Leer Producto");
    }
    public void LeerProducto(String nombre){
      System.out.println("Leer Producto");
    }

    public void ActualizarProducto(){
      System.out.println("Modificar Producto");
    }
    public void ActualizarProducto(String nombre){
      System.out.println("Modificar Producto");
    }

    public void EliminarProducto(){
      System.out.println("Eliminar Producto");
    }
    public void EliminarProducto(String nombre){
      System.out.println("Eliminar Producto");
    }
}
