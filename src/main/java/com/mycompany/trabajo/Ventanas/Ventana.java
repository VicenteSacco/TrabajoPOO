/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo.Ventanas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Ventana extends JFrame{
   public Ventana(){
       // tamaño de la ventana 
       setSize(500,500);
       
       // cerar ventana con la x
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       // le da un titulo a la ventana
       setTitle("Aplicacion de balanse Calorico");
       
       // Posiciona la ventana en el centro
       setLocationRelativeTo(null);
       
       // impide que la ventana se pueda cambiar la resolucion
       setResizable(false);
       
       //cambiar el color del background o fondo
       this.getContentPane().setBackground(Color.cyan);
       
       iniciarComponentesVentana();
       
       
   }
   
   private void iniciarComponentesVentana(){
       
       // creamos el jpanel para poner todo lo necesario.
       JPanel panel = new JPanel();
       
       //creamos este comando para poder permitir colocar las etiquetas en x 
       // posicion 
       
       panel.setLayout(null);
       
       // colocamos el jpanl por encima de la ventana
       this.getContentPane().add(panel);
       
       
       //colocamos color al panel para testear
       panel.setBackground(Color.cyan);
       
       //es una etiqueta sirve para texto o imagenes
       JLabel inicio = new JLabel("Sean bienvenidos a esta aplicación. "
               + "La funcionalidad del programa es poder calcular  ") ;
       JLabel inicio2 = new JLabel("el balance calórico."
               + " Para ello usted puede ingresar "
               + "sus datos, sus alimentos y sus ");
       JLabel inicio3 = new JLabel("ejercicios por fecha y observar su balance "
               + "calórico.");
       JLabel inicio4 = new JLabel("Ingresar Datos Personales :");
       JLabel opciones1 = new JLabel("Ingresar Su Nombre  :");
       JLabel opciones2 = new JLabel("Ingresar Su Peso  :");
       JLabel opciones3 = new JLabel("Ingresar Su Altura  :");
       
       //colocamos la etiquetaen alguna posicion
       inicio.setBounds(0, 0, 100000, 50);
       inicio2.setBounds(0,20,100000 ,50);
       inicio3.setBounds(0,40,100000 ,50);
       inicio4.setBounds(10,100,100000 ,50);
       opciones1.setBounds(10,160,100000 ,50);
       opciones2.setBounds(10,210,100000 ,50);
       opciones3.setBounds(10,260,100000 ,50);
       
        //cambiar color a la etiqueta 
       inicio.setForeground(Color.BLUE);
       inicio2.setForeground(Color.BLUE);
       inicio3.setForeground(Color.BLUE);
       inicio4.setForeground(Color.BLUE);
       opciones1.setForeground(Color.BLUE);
       opciones2.setForeground(Color.BLUE);
       opciones3.setForeground(Color.BLUE);
       
       // agregamos la etiqueta la panel
       panel.add(inicio);
       panel.add(inicio2);
       panel.add(inicio3);
       panel.add(inicio4);
       panel.add(opciones1);
       panel.add(opciones2);
       panel.add(opciones3);
       
       // agregar cajas de texto 
       JTextField cajaTexto1 = new JTextField ();
       JTextField cajaTexto2 = new JTextField ();
       JTextField cajaTexto3 = new JTextField ();
       
       // posicionar las cajas de texto
       cajaTexto1.setBounds(10, 200, 450 , 20);
       cajaTexto2.setBounds(10, 250, 450 , 20);
       cajaTexto3.setBounds(10, 300, 450 , 20);
       
       // agragar a la hoja las cajas de texto
       panel.add(cajaTexto1);
       panel.add(cajaTexto2);
       panel.add(cajaTexto3);
       
        
       // agregamos un boton 
       JButton boton1 = new JButton ("Ingresar");
       boton1.setBounds(175, 350, 100, 40);
       
       //cambiamos el color
       boton1.setForeground(Color.BLUE);
       
       // agregamod el boton al panel
       panel.add(boton1);
       
       // como hacer un evento cuando se presiona un boton
       // action listener es una interface 
       
       
       ActionListener evento = new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               
               String nombre = cajaTexto1.getText();
               String peso = cajaTexto2.getText();
               String altura = cajaTexto3.getText();
               float peso2 = Float.valueOf(peso);
               float altura2 = Float.valueOf(altura);
               Persona persona = new Persona(nombre,peso2,altura2);
               System.out.println(persona.getNombre());
               System.out.println(persona.getPeso());
               System.out.println(persona.getAltura());
                VentanaOpciones ventana2 = new VentanaOpciones();
                ventana2.setVisible(true);
                
           }
       };
       boton1.addActionListener(evento);
   }
    
    
    
}