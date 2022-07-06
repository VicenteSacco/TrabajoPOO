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
public class Aerobico implements Deportes {
    
    private int tipoEjercicio;
    private int tiempoEjercicios;

    public Aerobico(int tipoEjercicio, int tiempoEjercicios) {
        this.tipoEjercicio = tipoEjercicio;
        this.tiempoEjercicios = tiempoEjercicios;
    }
    public Aerobico() {
        
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
     public void ImprimirEjercicios(){
      
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
       
       
       
   }
   @Override
     public float CalcularCaloriasQuemadas(){
      float numero = 2;
      return numero ;
       
  } 
}
