/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.dopreparcial3corte.services;

import edu.eci.arsw.dopreparcial3corte.model.Cadena;
import edu.eci.arsw.dopreparcial3corte.persistence.Persistence;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author camilo
 */
@Service
public class ServicesStub implements Services{
    
    @Autowired
    Persistence persistence;

    @Override
    public void crearNuevaCadena(Cadena cadena) {
        persistence.crearNuevaCadena(cadena);
    }

    @Override
    public List<Cadena> obtenerLasUltimas10Cadenas() {
        return persistence.obtenerLasUltimas10Cadenas();
    }

    
}
