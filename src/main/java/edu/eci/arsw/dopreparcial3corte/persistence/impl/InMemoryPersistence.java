/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.dopreparcial3corte.persistence.impl;

import edu.eci.arsw.dopreparcial3corte.model.Cadena;
import edu.eci.arsw.dopreparcial3corte.model.CadenaRepository;
import edu.eci.arsw.dopreparcial3corte.persistence.Persistence;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author camilo
 */
@Service
public class InMemoryPersistence implements Persistence {

    @Autowired
    CadenaRepository cRepository;

    public InMemoryPersistence() {
    }   
    
    @Override
    public void crearNuevaCadena(Cadena cadena) {
        Cadena nuevaCadena = cadena;

        cRepository.save(nuevaCadena);
    }

    @Override
    public List<Cadena> obtenerLasUltimas10Cadenas() {
        List<Cadena> lista10Cadenas = new ArrayList<>();
        List<Cadena> listaCadenas = cRepository.findAll();       

        if (listaCadenas.size() >= 10) {
            for (int x = listaCadenas.size() - 1; x > listaCadenas.size() - 11; x--) {
                lista10Cadenas.add(listaCadenas.get(x));
            }
            return lista10Cadenas;
        } else {
            System.out.println("No existen 10 cadenas");
            return listaCadenas;
        }
    }

}
