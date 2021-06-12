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
public class Jugadores extends Persona{
    private int numero;
    private String posicion;

    public Jugadores(String nomYApell, int dni, int numero, String posicion) {
        super(nomYApell, dni);
        this.numero = numero;
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return super.getNombreYApell() + " pos: " + this.posicion + "\n";
    }
    
    
}
