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
public class DirectorTecnico extends Persona{
    private int idTecnico;
    
    public DirectorTecnico(String nombreYApell, int dni, int idTecnico) {
        super(nombreYApell, dni);
        this.idTecnico = idTecnico;
    }

    public int getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }
    
}
