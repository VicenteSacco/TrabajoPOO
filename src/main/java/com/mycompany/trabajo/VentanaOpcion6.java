/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class VentanaOpcion6 extends JFrame{
    public VentanaOpcion6(){
        // tamaño de la ventana 
       setSize(500,500);
       
       // cerar ventana con la x
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       // le da un titulo a la ventana
       setTitle("Aplicacion de balance Calorico");
       
       // Posiciona la ventana en el centro
       setLocationRelativeTo(null);
       
       // impide que la ventana se pueda cambiar la resolucion
       setResizable(false);
       
       //cambiar el color del background o fondo
       this.getContentPane().setBackground(Color.cyan);
       
       iniciarComponentes();
      }
    
    public void iniciarComponentes(){
         
       // creamos el jpanel para poner todo lo necesario.
       JPanel panel = new JPanel();
       
        //creamos este comando para poder permitir colocar las etiquetas en x 
       // posicion 
       
       panel.setLayout(null);
       
       // colocamos el jpanl por encima de la ventana
       this.getContentPane().add(panel);
       
       
       //colocamos color al panel para testear
       panel.setBackground(Color.cyan);
        
        
        
        
    }
    
}