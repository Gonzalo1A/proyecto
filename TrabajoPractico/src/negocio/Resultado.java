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
public class Resultado {
    private int golLocal;
    private int golVisitante;

    public Resultado() {
        this.golLocal =0;
        this.golVisitante=0;
    }

    
    public int getGolLocal() {
        return golLocal;
    }

    public int getGolVisitante() {
        return golVisitante;
    }

    public void golLocal(){
        this.golLocal+=1;
    }
    public void golVisitante(){
        this.golVisitante+=1;
    }
}
