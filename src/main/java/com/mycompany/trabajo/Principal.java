package com.mycompany.trabajo;

import java.util.ArrayList;

public class Principal {
    
    public static ArrayList<Fecha> ListaFecha ;
    
    public static void main(String[] args) {
       
        ListaFecha = new ArrayList<>();
       
        Registro r = new Registro();
       
        r.setVisible(true);
    }
}
