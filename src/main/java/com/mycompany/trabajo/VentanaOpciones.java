/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
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
        
        // impide que la ventana se pueda cambiar la resolucion
       setResizable(false);
        
        //cambiar el color del background o fondo
       this.getContentPane().setBackground(Color.cyan);
       
        // cerar ventana con la x
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentesVentana();
    }
    
    private void iniciarComponentesVentana(){
        
       // creamos el jpanel para poner todo lo necesario.
       JPanel panel = new JPanel();
       
       // le da un titulo a la ventana
       setTitle("Aplicacion de balance Calorico");
       
       //creamos este comando para poder permitir colocar las etiquetas en x 
       // posicion
       panel.setLayout(null);
       
       // colocamos el jpanl por encima de la ventana
       this.getContentPane().add(panel);
       
       //colocamos color al panel para testear
       panel.setBackground(Color.cyan);
       
       //es una etiqueta sirve para texto o imagenes
       JLabel opcion1 = new JLabel("1.- Crear Fecha ");
       JLabel opcion2 = new JLabel("2.- Imprimir Fecha ");
       JLabel opcion3 = new JLabel("3.- Modificar Fecha ");
       JLabel opcion4 = new JLabel("4.- Eliminar Fecha ");
       JLabel opcion5 = new JLabel("6.- Crear Producto ");
       JLabel opcion6 = new JLabel("7.- Imprimir Producto ");
       JLabel opcion7 = new JLabel("8.- Modificar Producto ");
       JLabel opcion8 = new JLabel("9.- Eliminar Producto ");
       
       
       //colocamos la etiqueta en alguna posicion
       opcion1.setBounds(0, 0, 200, 50);
        opcion2.setBounds(0, 50, 200, 50);
        opcion3.setBounds(0, 100, 200, 50);
        opcion4.setBounds(0, 150, 200, 50);
        opcion5.setBounds(0, 200, 200, 50);
        opcion6.setBounds(0, 250, 200, 50);
        opcion7.setBounds(0, 300, 200, 50);
        opcion8.setBounds(0, 350, 200, 50);
        
        //cambiar color a la etiqueta 
       opcion1.setForeground(Color.BLUE);
       opcion2.setForeground(Color.BLUE);
       opcion3.setForeground(Color.BLUE);
       opcion4.setForeground(Color.BLUE);
       opcion5.setForeground(Color.BLUE);
       opcion6.setForeground(Color.BLUE);
       opcion7.setForeground(Color.BLUE);
       opcion8.setForeground(Color.BLUE);
       
       // agregamos la etiqueta la panel
       panel.add(opcion1);
       panel.add(opcion2);
       panel.add(opcion3);
       panel.add(opcion4);
       panel.add(opcion5);
       panel.add(opcion6);
       panel.add(opcion7);
       panel.add(opcion8);
       
       // agregamos un boton 
       JButton boton1 = new JButton ("Ingresar");
       JButton boton2 = new JButton ("Ingresar");
       JButton boton3 = new JButton ("Ingresar");
       JButton boton4 = new JButton ("Ingresar");
       JButton boton5 = new JButton ("Ingresar");
       JButton boton6 = new JButton ("Ingresar");
       JButton boton7 = new JButton ("Ingresar");
       JButton boton8 = new JButton ("Ingresar");
       
       //lo agragamos al panel
       panel.add(boton1);
       panel.add(boton2);
       panel.add(boton3);
       panel.add(boton4);
       panel.add(boton5);
       panel.add(boton6);
       panel.add(boton7);
       panel.add(boton8);
       
       //posicion botones
       boton1.setBounds(175, 0, 100, 40);
       boton2.setBounds(175, 50, 100, 40);
       boton3.setBounds(175, 100, 100, 40);
       boton4.setBounds(175, 150, 100, 40);
       boton5.setBounds(175, 200, 100, 40);
       boton6.setBounds(175, 250, 100, 40);
       boton7.setBounds(175, 300, 100, 40);
       boton8.setBounds(175, 350, 100, 40);
       
       // eventos de botones :
       ActionListener evento1 = new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               
               
               
                VentanaOpcion1 ventana2 = new VentanaOpcion1();
                ventana2.setVisible(true);
                
           }
       };
        boton1.addActionListener(evento1);
        
        ActionListener evento2 = new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               
               VentanaOpcion6 ventana6 = new VentanaOpcion6();
               ventana6.setVisible(true);
                
                
           }
       };
        boton5.addActionListener(evento2);
    }
     
        
      
}