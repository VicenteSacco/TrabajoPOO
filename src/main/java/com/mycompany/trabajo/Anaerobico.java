package com.mycompany.trabajo;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mauro
 */
public class Anaerobico implements Deportes{
    
    private int tipoEjercicio;
    private int tiempoEjercicios;

    public Anaerobico(int tipoEjercicio, int tiempoEjercicios) {
        this.tipoEjercicio = tipoEjercicio;
        this.tiempoEjercicios = tiempoEjercicios;
    }
    public Anaerobico() {
        
    }

    public int getTipoEjercicio() {
        return tipoEjercicio;
    }

    public void setTipoEjercicio(int tipoEjercicio) {
        this.tipoEjercicio = tipoEjercicio;
    }

    public int getTiempoEjercicios() {
        return tiempoEjercicios;
    }

    public void setTiempoEjercicios(int tiempoEjercicios) {
        this.tiempoEjercicios = tiempoEjercicios;
    }
    
     @Override
     public float CalcularCaloriasQuemadas(){
      float numero = 2;
      return numero ;
       
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
       
       
       
   }  
    @Override
   public void ImprimirEjercicios(){
      
  }
   
}