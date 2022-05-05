/*
  Vicente Sacco 20.502.134-5
  
  Mauro Alicera 19.980.080-9

  Jorge Gonzalez 18.236.888-1
*/

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Persona persona = new Persona();
        Fecha fecha = new Fecha();
        Producto producto = new Producto();
        
        int opcion;

        System.out.println("Bienvenido! Desea registrarse?");
        System.out.println("1.- Si");
        System.out.println("2.- No");
        System.out.println("Elija opcion: ");
        opcion=entrada.nextInt();

        if(opcion==1)
            persona.CrearPersona();
        do{
            System.out.println("=====================");
            System.out.println("1.- Imprimir Persona");
            System.out.println("2.- Eliminar Persona");
            System.out.println("3.- Crear Fecha");
            System.out.println("4.- Imprimir Fecha");
            System.out.println("5.- Eliminar Fecha");
            System.out.println("6.- Crear Producto");
            System.out.println("7.- Imprimir Producto");
            System.out.println("8.- Eliminar Producto");
            System.out.println("9.- Salir");
            System.out.println("Elija opcion: ");
            opcion=entrada.nextInt();
             
            switch(opcion){
                case 1: 
                //Imprimir Persona
                break;

                case 2: 
                //Eliminar Persona
                break;   

                case 3:
                //Crear Fecha
                break;

                case 4: 
                //Imprimir Fecha
                break;

                case 5:
                //Eliminar Fecha
                break;
            }
        }while(opcion!=9);
    }
}