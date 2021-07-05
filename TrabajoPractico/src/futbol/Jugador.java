/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

/**
 *
 * @author Gonzalo
 */
public class Jugador extends Persona{
    private int numero;
    private String posicion;
    private int id_jugador;
    public Jugador(int id_jugador, String nombreYApellido, int dni, int numero, String posicion) {
        super(nombreYApellido, dni);
        this.id_jugador = id_jugador;
        this.numero = numero;
        this.posicion = posicion;
    }

    public int getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(int id_jugador) {
        this.id_jugador = id_jugador;
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
        return super.getNombreYApellido() + " pos: " + this.posicion + "\n";
    }
    
    
}
