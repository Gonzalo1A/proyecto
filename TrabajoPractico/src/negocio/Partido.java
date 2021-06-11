/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Date;

/**
 *
 * @author Gonzalo
 */
public class Partido {

    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;
    private boolean disputado;

    public Partido(Equipo local, Equipo visitante) {
        this.local = local;
        this.visitante = visitante;
        this.disputado = false;
    }

    public void golLocal() {
        resultado.golLocal();
    }

    public void golVisitante() {
        resultado.getGolVisitante();
    }

    public boolean isDisputado() {
        return disputado;
    }

    public void setDisputado(boolean disputado) {
        this.disputado = disputado;
    }

    public Equipo ganador() {
        int a = this.resultado.getGolLocal();
        int b = this.resultado.getGolVisitante();
        if (a > b) {
            return this.local;
        } else {
            return this.visitante;
        }
    }
    public void sumarPuntos(){
        ganador().sumarPuntos(1);
    }

}
