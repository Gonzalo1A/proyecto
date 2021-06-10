/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 *
 * @author Gonzalo, Lucas, Alex
 */
public class Torneo {
    private List<Partido> octavos;
    private List<Partido> cuartos;
    private List<Partido> semis;
    private List<Partido> finals;
    private String Nombre;
    private List<Equipo> equipos;

    public Torneo(List<Partido> octavos) {
        this.octavos = new ArrayList<>();
        this.cuartos = new ArrayList<>();
        this.semis = new ArrayList<>();
        this.finals = new ArrayList<>();
    
    }
    
    public Partido nuevo(Date fecha){
         int contador = 0;
         Equipo ganador1 = null;
         Equipo ganador2 = null;
        for(Partido p : octavos){
            if(contador==0){
              ganador1 = p.ganador();
                contador+=1;
            }
            else{
                ganador2 = p.ganador();
                break;
            }
        }
        Partido partido = new Partido(ganador1, ganador2, fecha);
        return partido;
    }
    
    public void agregarOctavos
//    public List<Partido> cuartos(){
//        for(Partido p : octavos){
//            Equipo ganador = p.ganador();
//            
//        }
//        Partido partido = new Partido(local, visitante, resultado, fecha);
//    }
}
