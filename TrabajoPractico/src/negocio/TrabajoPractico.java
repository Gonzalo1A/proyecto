/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo
 */
public class TrabajoPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DirectorTecnico dt1 = new DirectorTecnico("Carlos Romario",235665,1555);
        DirectorTecnico dt2 = new DirectorTecnico("Juan Carlos Bebeto",233564,1001);
        DirectorTecnico dt3 = new DirectorTecnico("Roberto Fiasco",125665,1052);
        DirectorTecnico dt4 = new DirectorTecnico("Gonzalo MalaFama",935665,2011);

        Jugadores jg1 = new Jugadores("Gabriel Baquistata",2555156,9,"DEL");
        Jugadores jg2 = new Jugadores("Juan Castolo",2535156,14,"DEF");
        Jugadores jg3 = new Jugadores("Omar Banchero",2555656,2,"ARQ");
        Jugadores jg4 = new Jugadores("El Pichichi Scioli",458326,10,"DEL");
        Jugadores jg5 = new Jugadores("Hugo Jerez",1456156,4,"MED");
        Jugadores jg6 = new Jugadores("Fernando Rotonda",2567856,5,"DEL");
        Jugadores jg7 = new Jugadores("Hugo Gatti",2423423,1,"MED");
        Jugadores jg8 = new Jugadores("German Garcia",2423356,11,"ARQ");
        Jugadores jg9 = new Jugadores("German Gonzalez",2653987,12,"DEL");
        Jugadores jg10 = new Jugadores("German Loufei",2415693,20,"DEF");
        ArrayList<Jugadores> plantel = new ArrayList();
        plantel.add(jg1);
        plantel.add(jg2);
        plantel.add(jg3);
        plantel.add(jg4);
        plantel.add(jg5);
        ArrayList<Jugadores> plantel2 = new ArrayList<>();
        plantel2.add(jg6);
        plantel2.add(jg7);
        plantel2.add(jg8);
        plantel2.add(jg9);
        plantel2.add(jg10);
        Equipo eq1 = new Equipo("Pamplona FC","Azul",dt1, plantel);
        Equipo eq2 = new Equipo("Deportivo Yahoo","Rojo",dt2 , plantel2);
        Equipo eq3 = new Equipo("FC Google","ArcoIris",dt3, plantel);
        Equipo eq4 = new Equipo("Real Madrid","Blanco",dt4, plantel2);
        
        Torneo torneo = new Torneo("Clown cop" );
        torneo.agregarEquipo(eq1);
        torneo.agregarEquipo(eq2);
        torneo.agregarEquipo(eq3);
        torneo.agregarEquipo(eq4);
        ArrayList<Partido> partidos = torneo.encuentros();
        System.out.println(partidos);
        partidos.get(0).golLocal();
        partidos.get(0).setDisputado();
        partidos.get(0).sumarPuntos();
        if(partidos.get(0).getDisputado()){
            System.out.println("Resultado: " + partidos.get(0).getResultado() );
        }
        torneo.orden();
        System.out.println(torneo);
        System.out.println(eq1);
    }
    
}
