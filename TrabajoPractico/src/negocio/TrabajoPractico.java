/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Scanner;

/**
 *
 * @author Gonzalo, Lucas, Alex
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


        Equipo eq1 = new Equipo("Pamplona FC","Azul",dt1);
        Equipo eq2 = new Equipo("Deportivo Yahoo","Rojo",dt2);
        Equipo eq3 = new Equipo("FC Google","ArcoIris",dt3);
        Equipo eq4 = new Equipo("Real Madrid","Blanco",dt4);

        Partido p1 = new Partido(eq1, eq2);
        Partido p2 = new Partido(eq3, eq4);

        System.out.println(eq1);

    }
    
}
