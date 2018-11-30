/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.dopreparcial3corte.persistence;

import edu.eci.arsw.dopreparcial3corte.model.Cadena;
import java.util.Date;
import java.util.List;

/**
 *
 * @author camilo
 */
public interface Persistence {
    
    /**
     *
     * @param cadena
     */
    public void crearNuevaCadena(Cadena cadena);
    
    /**
     *
     * @return
     */
    public List<Cadena> obtenerLasUltimas10Cadenas();
}
