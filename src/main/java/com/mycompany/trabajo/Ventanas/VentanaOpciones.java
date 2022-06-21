/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo.Ventanas;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaOpciones extends JFrame {
    public VentanaOpciones(){
        
         // tamaño de la ventana 
         setSize(500,500);
         
         // Posiciona la ventana en el centro
        setLocationRelativeTo(null);
        
        //cambiar el color del background o fondo
       this.getContentPane().setBackground(Color.cyan);
       
        // cerar ventana con la x
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentesVentana();
    }
    
    private void iniciarComponentesVentana(){
        
       // creamos el jpanel para poner todo lo necesario.
       JPanel panel = new JPanel();
        
        
    }
}
