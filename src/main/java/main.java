import java.text.ParseException;
import java.util.Scanner;
/*
  Vicente Sacco 20.502.134-5
  
  Mauro Alicera 19.980.080-9

  Jorge Gonzalez 18.236.888-1
*/
public class main {
     public static Persona persona =new Persona();
     public static Fecha fecha=new Fecha();
     
     public static void main(String args[]) throws ParseException {
       Scanner Entrada;
       int opcion;
       do{
           
            System.out.println("1- Crear Persona");
            System.out.println("2- Imprimir Persona");
            System.out.println("3- Eliminar Persona");
            System.out.println("4- Crear Fecha");
            System.out.println("5- Imprimir Fecha");
            System.out.println("6- Eliminar Fecha");
            System.out.println("7- Salir");

            System.out.println("Digite la opcion: ");
            Entrada=new Scanner(System.in);
            opcion=Entrada.nextInt();
           
           switch(opcion){
               case 1:
                    //Crear Persona
                    persona.CrearPersona();
               break;
               
               case 2:
                   //Imprimir Persona
                     persona.ImprimirDatos();
               break;
               
               case 3:
                   //Eliminar Persona
                   
                   
               break;
               
               
               case 4:
                    //Crear Fecha
                    fecha.CrearFecha(persona);
               break;
               
               case 5: 
                     //Imprimir Fecha
                      fecha.ImprimirDatos();
                break;
               case 6:
                     //Eliminar Fecha
                     
                break;
              
           }

       }while(opcion!=7);
       
       
    }
}
