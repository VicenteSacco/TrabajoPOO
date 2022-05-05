import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Fecha {
    //Atributos
    private Date fecha;
    private ArrayList<Producto> ListaProducto = new ArrayList<Producto>();

    //Constructores
    public Fecha() {
    }
    
    public Fecha(Date fecha) {
        this.fecha = fecha;
    }

    //Accesores(Getters)
    public Date getFecha() {
        return fecha;
    }

    public ArrayList<Producto> getListaProducto() {
        return ListaProducto;
    }
    
    //Mutadores(Setters)
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setListaProducto(ArrayList<Producto> ListaProducto) {
        this.ListaProducto = ListaProducto;
    }
    
    public void CrearProducto(){
        String nombre;
        int calorias;
        int gramos;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese calorias: ");
        calorias = entrada.nextInt();
        System.out.println("Ingrese gramos: ");
        gramos = entrada.nextInt();
        
        ListaProducto.add(new Producto(nombre,calorias,gramos));
    }
    
    public void ImprimirProducto(){
        for(int i = 0 ; i < ListaProducto.size() ; i++){
            System.out.println("=====ListaProductos=====");
            System.out.println("Nombre: "+ListaProducto.get(i).getNombre());
            System.out.println("Calorias: "+ListaProducto.get(i).getCalorias());
            System.out.println("Cantidad: "+ListaProducto.get(i).getCantidad());
        }
    }
    
    public void EliminarProducto(String nombre){
        for(int i=0; i<ListaProducto.size(); i++){
            if(nombre.equals(ListaProducto.get(i).getNombre())){
                ListaProducto.remove(i);
                break;
            }
        }
    }
    
    public void ModificarProducto(String nombreEliminar, String nombre, int calorias, int cantidad){
        for(int i = 0 ; i < ListaProducto.size(); i++){
            if(nombreEliminar.equals(ListaProducto.get(i).getNombre())){
                ListaProducto.get(i).setNombre(nombre);
                ListaProducto.get(i).setCalorias(calorias);
                ListaProducto.get(i).setCantidad(cantidad);
            }
        }
    }
  
    public Producto EncontrarProducto(String nombre){
        for(int i = 0 ;i<ListaProducto.size();i++){
            if(nombre == ListaProducto.get(i).getNombre())
                return ListaProducto.get(i);
        }
        return null;
    }
    
}