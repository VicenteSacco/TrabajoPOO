package com.mycompany.trabajo;

/*
  Vicente Sacco 20.502.134-5
  
  Mauro Alicera 19.980.080-9

  Jorge Gonzalez 18.236.888-1
*/

import java.util.Scanner;

public class Principal {
    
    public static Persona persona = new Persona();
    public static Fecha fecha = new Fecha();
    public static ProductoNoSano productonosano = new ProductoNoSano();
    public static ProductoSano productosano = new ProductoSano();
    public static Aerobico aerobico = new Aerobico();
    public static Anaerobico anaerobico = new Anaerobico();
        
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
            System.out.println("12.- Crear Ejercicio");
            System.out.println("13.- Imprimir Ejercicio");
            System.out.println("14.- Calcular Calorias Totales");
            System.out.println("15.- Calcular Elemento Mas calorico");
            System.out.println("16.- Salir");
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
                    int condicion,OpcionProducto;
                    condicion=0;
                    while(condicion != 1){
                    System.out.println("Digite 1 para ingresar producto Sano, digite 2 para producto no Sano");
                    OpcionProducto=entrada.nextInt();
                    if(OpcionProducto==1){
                      productosano.crearProducto();
                      condicion=1;
                    }
                    if(OpcionProducto==2){
                      productonosano.crearProducto();
                      condicion=1;     
                    }
                    else
                      System.out.println("El numero que ingreso no es correcto, intentelo denuevo");
                    }
                break;
                
                case 8:
                    productonosano.descripcionProducto();
                break;
                
                case 9:
                    String nombre;
                    System.out.println("Ingrese nombre: ");
                    nombre = entrada.next();
                    //fecha.EncontrarProducto(nombre);
                    ProductoNoSano.fecha.EncontrarProducto(nombre);
                break;
                
                case 10:
                    String nombreActual, nombreNuevo;
                    int calorias, cantidad,sellos;
                    System.out.println("Ingrese nombre del producto a modificar: ");
                    nombreActual = entrada.next();
                    System.out.println("Ingrese nuevo nombre del producto: ");
                    nombreNuevo = entrada.next();
                    System.out.println("Ingrese nuevas calorias del producto: ");
                    calorias = entrada.nextInt();
                    System.out.println("Ingrese nueva cantidad del producto: ");
                    cantidad = entrada.nextInt();
                    System.out.println("Ingrese nueva cantidad de sellos producto: ");
                    sellos = entrada.nextInt();
                    fecha.ModificarProducto(nombreActual,nombreNuevo,calorias,cantidad,sellos);
                break;
                
                case 11:
                    String nombreAEliminar;
                    System.out.println("Ingrese nombre del producto a eliminar: ");
                    nombreAEliminar = entrada.next();
                    fecha.EliminarProducto(nombreAEliminar);
                break;
                
                case 12:
                    int tipo;
                    System.out.println("Ingrese el tipo de derporte que realizo: ");
                    System.out.println("1 si es anaerobico: ");
                    System.out.println("2 si es aerobico: ");
                    tipo =entrada.nextInt();
                    if(tipo==1){
                      anaerobico.CrearEjercicio();
                    }
                    if(tipo==2){
                      aerobico.CrearEjercicio();
                    }
                break;
                
                case 13 :
                    anaerobico.ImprimirEjercicios();
                    aerobico.ImprimirEjercicios();
                break;
                
                
                //Funcionalidades Propias. (EP4.1)
                case 14:
                    productonosano.CalcularCaloriasTotales();
                    productosano.CalcularCaloriasTotales();
                    break;
                
                    
                case 15:
                    productonosano.AlimentosMasCalorico();
                    productosano.AlimentosMasCalorico();
                    break;
            }
        }while(opcion!=16);
    }
}