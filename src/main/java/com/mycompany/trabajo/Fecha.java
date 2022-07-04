package com.mycompany.trabajo;

import java.util.ArrayList;
import java.util.Date;

public class Fecha {
    public ArrayList<ProductoSano> ListaProductoSano = new ArrayList<ProductoSano>();
    public ArrayList<ProductoNoSano> ListaProducto = new ArrayList<ProductoNoSano>();
    
    private Date fecha;

    public Fecha() {
    }
    
    public Fecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}   