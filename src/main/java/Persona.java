/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauro
 */

    

import java.util.ArrayList;
import java.util.Scanner;

public class Persona{
  ArrayList<Persona> ListaPersona;
  private String nombre;
  private int edad;
  private String sexo;
  private float peso;
  private float altura;
   
  //constructor
    public Persona(String nombre, int edad, String sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public Persona(){
          ListaPersona=new ArrayList<Persona>();
    }
    
    //accesores
    public ArrayList<Persona> getListaUsuario() {
        return ListaPersona;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }
    
    //mutadores
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    //comportamietos 
   // Sobrecarga en los comportamientos indicando el producto.
    public void CrearPersona(){
        String nombre,sexo;
        int edad;
        float peso , altura ;
        
        Scanner Entrada=new Scanner(System.in);
        System.out.println("Digite el nombre ");
        nombre=Entrada.next();
        
        System.out.println("Digite la edad");
        edad=Entrada.nextInt();
        
        System.out.println("Digite el sexo ");
        sexo=Entrada.next();
        
        System.out.println("Digite el peso");
        peso=Entrada.nextFloat();
        
        System.out.println("Digite el altura");
        altura=Entrada.nextFloat();
        
        
        Persona persona =new Persona(nombre,edad,sexo,peso,altura);
        ListaPersona.add(persona);
        
        System.out.println("CLiente creado!");
    }
    
    public boolean BuscarPersona(String Nombre){
        for(int i=0;i<ListaPersona.size();i++){
            
            if(ListaPersona.get(i).nombre.equals(Nombre)){
                return true;
            }
        }

        return false;
    }
    public Persona EncontrarI(String Nombre){
        for(int i=0;i<ListaPersona.size();i++){
            
            if(Nombre.equals(ListaPersona.get(i).nombre))
                
                return ListaPersona.get(i);
            
        }

        return null;   

    }
        
        
        
    
    
     public void ImprimirDatos(){
       
       for(int i=0;i<ListaPersona.size();i++){
                
               System.out.println("Nombre"+ListaPersona.get(i).nombre+"\nEdad"+ListaPersona.get(i).edad+"\nSexo"+ListaPersona.get(i).sexo+"\nPeso"+ListaPersona.get(i).peso+"\nAltura:"+ListaPersona.get(i).altura);
             }
             
       }
    
    public void ActualizarPersona(){
      System.out.println("Modificar Persona");
    }
    public void ActualizarPersona(String nombre){
      System.out.println("Modificar Persona");
    }

    public void EliminarPersona(){
      System.out.println("Eliminar Persona");
    }
    public void EliminarPersona(String nombre){
       System.out.println("Eliminar Persona");
}
}
