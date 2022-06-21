
package com.mycompany.trabajo.Ventanas;

public class Persona{
    //Atributos
    private String nombre;
    private float peso;
    private float altura;
    

    //Constructores
    public Persona() {
    }

    public Persona(String nombre, float peso, float altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    //Accesores(Getters)
    public String getNombre() {
        return nombre;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    

    //Mutadores(Setters)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
  }
