import java.util.ArrayList;
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
    public Persona CrearPersona(){
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
        return persona;
    }
    
    public void ImprimirPersona(Persona persona){
        System.out.println("Nombre: "+persona.nombre);
        System.out.println("Peso: "+persona.peso);
        System.out.println("Altura: "+persona.altura);
    }
    
    public void CrearFecha(){
        String fecha;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese fecha: ");
        fecha = entrada.next();
        
        Fecha objeto = new Fecha();
        objeto.setFecha(fecha);
        
        ListaFecha.add(objeto);
    }
    
    public void ImprimirFecha(){
        for(int i=0; i<ListaFecha.size(); i++){
            System.out.println("====================================");
            System.out.println("Fecha: "+ListaFecha.get(i).getFecha());
            ListaFecha.get(i).ImprimirProducto();
        }
    }
    
    public void EliminarFecha(String fecha){
        for(int i=0; i<ListaFecha.size(); i++){
            if(fecha.equals(ListaFecha.get(i).getFecha())){
                ListaFecha.remove(i);
                break;
            }
        }
    }
    
    public void ModificarFecha(String fechaActual, String fechaNueva){
        for(int i=0; i<ListaFecha.size(); i++){
            if(fechaActual.equals(ListaFecha.get(i).getFecha()))
                ListaFecha.get(i).setFecha(fechaNueva);
        }
    }
    
    public Fecha BuscarFecha(String fecha){
        for(int i=0; i<ListaFecha.size(); i++){
            if(fecha.equals(ListaFecha.get(i).getFecha()))
                return ListaFecha.get(i);
        }
        return null;
    }
}