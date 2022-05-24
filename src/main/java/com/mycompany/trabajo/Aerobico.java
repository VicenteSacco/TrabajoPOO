package com.mycompany.trabajo;

import java.util.ArrayList;
import java.util.Scanner;



public class Aerobico implements Deporte {
    private ArrayList <Aerobico> Laerobico = new ArrayList<Aerobico>();
    private int tipoEjercicio;
    private int tiempoEjercicios;
    
    //Constructor 
    public Aerobico(int tipoEjercicio, int tiempoEjercicios) {
        this.tipoEjercicio = tipoEjercicio;
        this.tiempoEjercicios = tiempoEjercicios;
    }
     public Aerobico() {
        
    }
    
    //getters

    public ArrayList<Aerobico> getLaerobico() {
        return Laerobico;
    }

    public int getTipoEjercicio() {
        return tipoEjercicio;
    }

    public int getTiempoEjercicios() {
        return tiempoEjercicios;
    }
    
    //setters 

    public void setLaerobico(ArrayList<Aerobico> Laerobico) {
        this.Laerobico = Laerobico;
    }

    public void setTipoEjercicio(int tipoEjercicio) {
        this.tipoEjercicio = tipoEjercicio;
    }

    public void setTiempoEjercicios(int tiempoEjercicios) {
        this.tiempoEjercicios = tiempoEjercicios;
    }
    
     @Override  
   public void CrearEjercicio(){
       int TipoEjercicio;
       int TiempoEjercicios;
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Ingresar el tipo de Ejercicio que estaba haciendo:");
       System.out.println("Ingrese 1.- Si usted realizo Trotar       ");
       System.out.println("Ingrese 2.- Si usted realizo Saltar la Cuerda ");
       System.out.println("Ingrese 3.- Si usted realizo Nadar   ");
       
       TipoEjercicio = entrada.nextInt();
       
       System.out.println("Ingrese cuanto tiempo realizo la actividad en minutos");
       TiempoEjercicios = entrada.nextInt();
       
       Laerobico.add(new Aerobico(TipoEjercicio,TiempoEjercicios));
       
   }
   public void CalcularCaloriasEjercidas(Aerobico aerobico){
      
       float caloriasQuemadas = 0;
       float calorias;
      
       int tiempo = aerobico.getTiempoEjercicios();
       if(aerobico.getTiempoEjercicios()== 1){
           // calorias de 10 minutos haciendo el ejercicio 
           calorias = 65;
           caloriasQuemadas = (tiempo/10)*calorias;
       }
       if(aerobico.getTiempoEjercicios()== 2){
            // calorias de 10 minutos haciendo el ejercicio 
           calorias = 130;
           caloriasQuemadas = (tiempo/10)*calorias;
       }    
       if(aerobico.getTiempoEjercicios()== 3){
            // calorias de 10 minutos haciendo el ejercicio 
           calorias = 630 ;
           caloriasQuemadas = (tiempo/10)*calorias;
       }
      
      
      System.out.println("Calorias Quemas:"+caloriasQuemadas);
  }
   
    @Override
   public void ImprimirEjercicios(){
      for(int i = 0 ; i < Laerobico.size() ; i++){
            System.out.println("=====ListaEjercicios=====");
            System.out.println("Tiempo: "+Laerobico.get(i).getTiempoEjercicios());
            if(Laerobico.get(i).getTipoEjercicio()==1){
                 System.out.println("Ejercicio:Trotar");
                 Laerobico.get(i).CalcularCaloriasEjercidas(Laerobico.get(i));
            }
            if(Laerobico.get(i).getTipoEjercicio()==2){
                 System.out.println("Ejercicio:Saltar La Cuerda");
                 Laerobico.get(i).CalcularCaloriasEjercidas(Laerobico.get(i));
            }
            if(Laerobico.get(i).getTipoEjercicio()==3){
                 System.out.println("Ejercicio:Nadar");
                 Laerobico.get(i).CalcularCaloriasEjercidas(Laerobico.get(i));
            }
            
            
        }
  }
}