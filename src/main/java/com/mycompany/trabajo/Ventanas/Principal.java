/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo.Ventanas;

/**
 *
 * @author redga
 */
public class Principal {
    
    public static Persona persona = new Persona();
    
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
        
        
        System.out.println("nombre "+persona.getNombre());
    }
}
