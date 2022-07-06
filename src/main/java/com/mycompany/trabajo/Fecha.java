package com.mycompany.trabajo;

import java.util.ArrayList;
import java.util.Date;

public class Fecha {
    private Date fecha;
    private ArrayList<Producto> ListaProducto = new ArrayList ();
    private ArrayList < Anaerobico> Listaanaerobico = new ArrayList();
    private ArrayList < Aerobico> Listaaerobica = new ArrayList();
    
    public Fecha(ArrayList<Producto> productos,Date fecha) {
        this.ListaProducto = productos;
        this.fecha = fecha;
    }

    public Fecha(Date fecha) {
        this.fecha = fecha;
    }
     public Fecha() {
        
    }
     
    public ArrayList<Producto> getListaProducto() {
        return ListaProducto;
    }
      
    public void setListaProducto(ArrayList<Producto> ListaProducto) {
        this.ListaProducto = ListaProducto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Anaerobico> getListaanaerobico() {
        return Listaanaerobico;
    }

    public void setListaanaerobico(ArrayList<Anaerobico> Listaanaerobico) {
        this.Listaanaerobico = Listaanaerobico;
    }
    
    public ArrayList<Aerobico> getListaaerobica() {
        return Listaaerobica;
    }

    public void setListaaerobica(ArrayList<Aerobico> Listaaerobica) {
        this.Listaaerobica = Listaaerobica;
    }
}    