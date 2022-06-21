/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;


import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class VentanaOpcion1 extends JFrame{
    public VentanaOpcion1(){
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
        
        // colocamos los label
        JLabel titulo = new JLabel("Opcion Para Agregar Una Fecha");
        JLabel indicacion1 = new JLabel(" Introduzca La Fecha ") ;
        JLabel indicacion2 = new JLabel(" Quiere regresar al menu ") ;
        JLabel indicacion3 = new JLabel(" Quiere introducir Productos ") ;
       
        // colocamos color 
       titulo.setForeground(Color.BLUE);
       indicacion1.setForeground(Color.BLUE);
       indicacion2.setForeground(Color.BLUE); 
       indicacion3.setForeground(Color.BLUE);
       
       
       // agregamos la etiqueta la panel
       panel.add(titulo);
       panel.add(indicacion1);
       panel.add(indicacion2);
       panel.add(indicacion3);
       
       
       //colocamos la etiqueta en alguna posicion
        titulo.setBounds(130, 0, 200, 50);
        indicacion1.setBounds(0, 100, 200, 50);
        indicacion2.setBounds(130, 240, 200, 50);
        indicacion3.setBounds(130, 350, 200, 50);
        
        
       // agregar cajas de texto 
       JTextField cajaTexto1 = new JTextField (); 
       
       // posicionar las cajas de texto
       cajaTexto1.setBounds(10, 150, 450 , 20);
       
       // agragar a la hoja las cajas de texto
       panel.add(cajaTexto1);
       
       //botones
       JButton boton1 = new JButton ("Ingresar");
       JButton boton2 = new JButton ("Ingresar");
       
       //agregamos botones
       panel.add(boton1);
       panel.add(boton2);
       
       //posicion botones
       boton1.setBounds(150, 280, 100, 40);
       boton2.setBounds(150, 390, 100, 40);
        
    }
    
           
}
