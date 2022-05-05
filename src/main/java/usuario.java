
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauro
 */
public class usuario {
    private String id;
    private String password;
     ArrayList<Persona> ListaUsuario=new ArrayList<Persona>();

    //constructor
    public usuario(String id, String password) {
        this.id = id;
        this.password = password;
    }

    //accesores
    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    //mutadores
    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
