/*
  Vicente Sacco 20.502.134-5
  
  Mauro Alicera 19.980.080-9

  Jorge Gonzalez 18.236.888-1
*/

import java.util.Scanner;

public class Principal {
    
    public static Persona persona = new Persona();
    public static Fecha fecha = new Fecha();
    public static Producto producto = new Producto();
        
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int opcion;

        System.out.println("Bienvenido! Desea registrarse?");
        System.out.println("1.- Si");
        System.out.println("2.- No");
        System.out.println("Elija opcion: ");
        opcion=entrada.nextInt();

        if(opcion==1)
            persona = persona.CrearPersona();
        do{
            System.out.println("=====================");
            System.out.println("1.- Imprimir Persona");
            System.out.println("2.- Crear Fecha");
            System.out.println("3.- Imprimir Fecha");
            System.out.println("4.- Modificar Fecha");
            System.out.println("5.- Buscar Fecha");
            System.out.println("6.- Eliminar Fecha");
            System.out.println("7.- Crear Producto");
            System.out.println("8.- Imprimir Producto");
            System.out.println("9.- Encontrar Producto");
            System.out.println("10.- Modificar Producto");
            System.out.println("11.- Eliminar Producto");
            System.out.println("12.- Salir");
            System.out.println("Elija opcion: ");
            opcion=entrada.nextInt();
            
            switch(opcion){
                case 1: 
                    persona.ImprimirPersona(persona);
                break;

                case 2: 
                    persona.CrearFecha();
                break;   

                case 3:
                    persona.ImprimirFecha();
                break;

                case 4:
                    String fechaActual, fechaNueva;
                    System.out.println("Ingrese fecha actual: ");
                    fechaActual = entrada.next();
                    System.out.println("Ingrese fecha nueva: ");
                    fechaNueva = entrada.next();
                    persona.ModificarFecha(fechaActual, fechaNueva);
                break;
                    
                case 5:
                    String fechaABuscar;
                    System.out.println("Ingrese fecha a buscar: ");
                    fechaABuscar = entrada.next();
                    persona.BuscarFecha(fechaABuscar);
                break;
                    
                case 6:
                    String fechaAEliminar;
                    System.out.println("Ingrese fecha a eliminar: ");
                    fechaAEliminar = entrada.next();
                    persona.EliminarFecha(fechaAEliminar);
                break;

                case 7:
                    fecha.CrearProducto();
                break;
                
                case 8:
                    fecha.ImprimirProducto();
                break;
                
                case 9:
                    String nombre;
                    System.out.println("Ingrese nombre: ");
                    nombre = entrada.next();
                    fecha.EncontrarProducto(nombre);
                break;
                
                case 10:
                    String nombreActual, nombreNuevo;
                    int calorias, cantidad;
                    System.out.println("Ingrese nombre del producto a modificar: ");
                    nombreActual = entrada.next();
                    System.out.println("Ingrese nuevo nombre del producto: ");
                    nombreNuevo = entrada.next();
                    System.out.println("Ingrese nuevas calorias del producto: ");
                    calorias = entrada.nextInt();
                    System.out.println("Ingrese nueva cantidad del producto: ");
                    cantidad = entrada.nextInt();
                    fecha.ModificarProducto(nombreActual,nombreNuevo,calorias,cantidad);
                break;
                
                case 11:
                    String nombreAEliminar;
                    System.out.println("Ingrese nombre del producto a eliminar: ");
                    nombreAEliminar = entrada.next();
                    fecha.EliminarProducto(nombreAEliminar);
                break;
            }
        }while(opcion!=12);
    }
}