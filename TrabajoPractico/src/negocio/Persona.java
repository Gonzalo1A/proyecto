/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Gonzalo
 */
public class Persona {
    private String nombreYApell;
    private int dni;

    public Persona(String nombreYApell, int dni) {
        this.nombreYApell = nombreYApell;
        this.dni = dni;
    }

    public String getNombreYApell() {
        return nombreYApell;
    }

    public void setNombreYApell(String nombreYApell) {
        this.nombreYApell = nombreYApell;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
}
