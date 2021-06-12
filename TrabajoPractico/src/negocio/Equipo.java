/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gonzalo
 */
public class Equipo {
    private String nombre;
    private String color;
    private String descripcion;
    private int puntos ;
    private List<Jugadores> plantilla;
    private DirectorTecnico directorTecnico;
    private boolean ganador = false;
    
    public Equipo(String nombre, String color, DirectorTecnico dt, List plantilla){
        this.nombre = nombre;
        this.color = color;
        this.puntos = 0;
        this.directorTecnico = dt;
        this.plantilla = plantilla;
    }
    public void setDescripcion(String desc){
        this.descripcion = desc;
    }
    public String getDescripcion(){
        return this.descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void sumarPuntos(int puntos) {
        this.puntos += puntos;
    }
    
    public void agregarJugador(Jugadores jugadores){
        this.plantilla.add(jugadores);
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }

    @Override
    public String toString() {
       
        return "Equipo: " + this.nombre +"\n Jugadores: \n"+ this.plantilla+ "\n Con: " + this.puntos + "pts";
    }
    
    
}
