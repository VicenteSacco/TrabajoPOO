
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauro
 */
public class Fecha {
    private int NFecha;
    private Date fecha;
    private Persona Fpersona ;
    private ArrayList<Fecha> ListaFecha=new ArrayList<Fecha>();
     private ArrayList<Producto> Fproductos=new ArrayList<Producto>();
  
    //constructor 
    public Fecha(){
        
    }
    
    public Fecha(Date fecha,ArrayList<Producto> productos) {
        this.fecha = fecha;
        this.Fpersona = Fpersona;
        this.Fproductos=productos;
    }

    //accesores
     public int getNFecha() {
        return NFecha;
    }
    public Date getFecha() {
        return fecha;
    }
   
    public Persona getPersona() {
        return Fpersona;
    }
    
   
    //mutadores
    public void setNFecha(int NFecha) {
        this.NFecha = NFecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public void setPersona(Persona persona) {
        this.Fpersona = persona;
    }
    
   
    
    //comportamientos
    
    public void CrearFecha(Persona persona)throws ParseException {
        String Fecha ;
        String nombre;
        
        
        
        int CantidadDeProductos;
        Scanner Entrada=new Scanner(System.in);
         System.out.println("Digite el nombre del cliente");
         nombre=Entrada.next();
          if(persona.BuscarPersona(nombre)){
         
         persona =persona.EncontrarI(nombre.toString());
         
         System.out.println("Datos de la Persona");
           System.out.println("Nombre: "+persona.getNombre());
           System.out.println("Edad:"+ persona.getEdad());
           System.out.println("Sexo:"+persona.getSexo());
           System.out.println("Peso:"+persona.getPeso());
           System.out.println("Altura:"+persona.getAltura());
           
            System.out.println("Digite la Fecha");
            Fecha=Entrada.next();
         
          Date FFecha=new SimpleDateFormat("dd/mm/yyyy").parse(Fecha);
          
        System.out.println("¿Cuantos productos consumio en el dia ?");
          CantidadDeProductos=Entrada.nextInt();
          
          Producto productos=new Producto();
          
          for(int i=1;i<=CantidadDeProductos;i++){
               System.out.println("Digite los datos del producto "+i);
               productos.CrearProducto();
              
            }
             Fecha fechas = new Fecha(FFecha,productos.getproducto());
           
             ListaFecha.add(fechas);
             System.out.println("Fecha creada");
    }else{
           System.out.println("La Persona no se encuentra registrado");
       } 
     }       
    public void ImprimirDatos(){
       
       for(int i=0;i<ListaFecha.size();i++){
              System.out.println("<<< ***************Factura No "+ListaFecha.get(i).getNFecha() + " ***********************>>>");
              System.out.println("<<<***************DATOS DE La Persona**************************************>>>");
              System.out.println("Nombre de la Persona: "+ ListaFecha.get(i).Fpersona.getNombre() +" Edad: "+ListaFecha.get(i).Fpersona.getEdad()+"Sexo : "+ListaFecha.get(i).Fpersona.getSexo()+"Peso:  "+ListaFecha.get(i).Fpersona.getPeso()+"Altura:  "+ListaFecha.get(i).Fpersona.getAltura());
              System.out.println("<<< ********************** Productos Consumidos******************************** >>>");
              System.out.println("<<< Nombre----------------Tipo----------------Cantidad----------------Calorias >>>>");
              for(int j=0;j<ListaFecha.get(i).Fproductos.size();j++){
                 System.out.println("<<< "+ListaFecha.get(i).Fproductos.get(j).getNombre()+"----------------"+ListaFecha.get(i).Fproductos.get(j).getTipo()+"----------------"+ListaFecha.get(i).Fproductos.get(j).getCantidad()+"----------------"+ListaFecha.get(i).Fproductos.get(j).getCalorias()+" >>>>");
                 
             }
             System.out.println("<<<***************************************************************************************>>>>");
             }
             
       }

   }
    

