
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Persona{
    //Atributos
    private String nombre;
    private float peso;
    private float altura;
    private ArrayList<Fecha> ListaFecha = new ArrayList<Fecha>();

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

    public ArrayList<Fecha> getListaFecha() {
        return ListaFecha;
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

    public void setListaFecha(ArrayList<Fecha> ListaFecha) {
        this.ListaFecha = ListaFecha;
    }

    //Métodos
    public void CrearPersona(){
        String nombre;
        float peso,altura;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese peso: ");
        peso = entrada.nextFloat();
        System.out.println("Ingrese altura: ");
        altura = entrada.nextFloat();
        
        Persona persona = new Persona(nombre,peso,altura);
    }
    
    public void ImprimirPersona(Persona persona){
        System.out.println("Nombre: "+persona.nombre);
        System.out.println("Peso: "+persona.peso);
        System.out.println("Altura: "+persona.altura);
    }
    
    public void CrearFecha() throws ParseException{
        String fecha;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese fecha: ");
        fecha = entrada.next();
        Date finalFecha = new SimpleDateFormat("dd/mm/yyyy").parse(fecha);
        Fecha fechaObjeto = new Fecha(finalFecha);
        ListaFecha.add(fechaObjeto);
    }
    
    public void ImprimirFecha(){
        for(int i=0; i<ListaFecha.size(); i++){
            System.out.println("Fecha: "+ListaFecha.get(i).getFecha());
            System.out.println("=================");
        }
    }
}