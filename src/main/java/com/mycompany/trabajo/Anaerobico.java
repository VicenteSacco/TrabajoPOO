package com.mycompany.trabajo;

import java.util.ArrayList;
import java.util.Scanner;

public class Anaerobico implements Deporte{
    private ArrayList <Anaerobico> Lanaerobico = new ArrayList<Anaerobico>();
    private int tipoEjercicio;
    private int tiempoEjercicios;
    
    //Constructor
    public Anaerobico(int tipoEjercicio, int caloriaQuemadas) {
        this.tipoEjercicio = tipoEjercicio;
        this.tiempoEjercicios = caloriaQuemadas;
    }
    public Anaerobico() {
        
    }
    
    //getters
    public int getTipoEjercicio() {
        return tipoEjercicio;
    }

    public int gettiempoEjercicios() {
        return tiempoEjercicios;
    }

    public ArrayList<Anaerobico> getLanaerobico() {
        return Lanaerobico;
    }
    
    //setters
    public void setTipoEjercicio(int tipoEjercicio) {
        this.tipoEjercicio = tipoEjercicio;
    }

    public void settiempoEjercicios(int caloriaQuemadas) {
        this.tiempoEjercicios = caloriaQuemadas;
    }

    public void setLanaerobico(ArrayList<Anaerobico> Lanaerobico) {
        this.Lanaerobico = Lanaerobico;
    }
   @Override  
   public void CrearEjercicio(){
       int TipoEjercicio;
       int TiempoEjercicios;
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Ingresar el tipo de Ejercicio que estaba haciendo:");
       System.out.println("Ingrese 1.- Si usted realizo Pesas        ");
       System.out.println("Ingrese 2.- Si usted realizo Abdominales  ");
       System.out.println("Ingrese 3.- Si usted realizo Flexiones    ");
       System.out.println("Ingrese 4.- Si usted realizo Plancha      ");
       TipoEjercicio = entrada.nextInt();
       
       System.out.println("Ingrese cuanto tiempo realizo la actividad en minutos");
       TiempoEjercicios = entrada.nextInt();
       
       Lanaerobico.add(new Anaerobico(TipoEjercicio,TiempoEjercicios));
       
   }
   

   public void CacularCaloriasEjercidas(Anaerobico anaerobico){
      
       float caloriasQuemadas = 0;
       float calorias;
       int tiempo = anaerobico.gettiempoEjercicios();
       if(anaerobico.gettiempoEjercicios()== 1){
           // calorias de 10 minutos haciendo el ejercicio 
           calorias = 74;
           caloriasQuemadas = (tiempo/10)*calorias;
       }
       if(anaerobico.gettiempoEjercicios()== 2){
            // calorias de 10 minutos haciendo el ejercicio 
           calorias = 98;
           caloriasQuemadas = (tiempo/10)*calorias;
       }    
       if(anaerobico.gettiempoEjercicios()== 3){
            // calorias de 10 minutos haciendo el ejercicio 
           calorias = 98 ;
           caloriasQuemadas = (tiempo/10)*calorias;
       }
      if(anaerobico.gettiempoEjercicios()== 4){
           // calorias de 10 minutos haciendo el ejercicio 
           calorias = 79;
           caloriasQuemadas = (tiempo/10)*calorias;
       }
      
      System.out.println("Calorias Quemas:"+caloriasQuemadas);
  }
  
  
   @Override
   public void ImprimirEjercicios(){
      for(int i = 0 ; i < Lanaerobico.size() ; i++){
            System.out.println("=====ListaEjercicios=====");
            System.out.println("Tiempo: "+Lanaerobico.get(i).gettiempoEjercicios());
            if(Lanaerobico.get(i).getTipoEjercicio()==1){
                 System.out.println("Ejercicio:Pesas");
                 Lanaerobico.get(i).CacularCaloriasEjercidas(Lanaerobico.get(i));
            }
            if(Lanaerobico.get(i).getTipoEjercicio()==2){
                 System.out.println("Ejercicio:Abdominales ");
                 Lanaerobico.get(i).CacularCaloriasEjercidas(Lanaerobico.get(i));
            }
            if(Lanaerobico.get(i).getTipoEjercicio()==3){
                 System.out.println("Ejercicio:Flexiones");
                 Lanaerobico.get(i).CacularCaloriasEjercidas(Lanaerobico.get(i));
            }
            if(Lanaerobico.get(i).getTipoEjercicio()==4){
                 System.out.println("Ejercicio:Plancha");
                 Lanaerobico.get(i).CacularCaloriasEjercidas(Lanaerobico.get(i));
            }
            
        }
  }
  
}