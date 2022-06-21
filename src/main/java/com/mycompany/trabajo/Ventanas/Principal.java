/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo.Ventanas;

/*
  Vicente Sacco 20.502.134-5
  
  Mauro Alicera 19.980.080-9

  Jorge Gonzalez 18.236.888-1
*/


public class Principal {
    
    public static Persona persona = new Persona();
    
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
        System.out.println("nombre "+persona.getNombre());
    }
}
