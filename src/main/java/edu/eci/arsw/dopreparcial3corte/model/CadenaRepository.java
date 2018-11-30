/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.dopreparcial3corte.model;

import java.io.Serializable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author camilo
 */
public interface CadenaRepository extends MongoRepository<Cadena, String>{
    
}
