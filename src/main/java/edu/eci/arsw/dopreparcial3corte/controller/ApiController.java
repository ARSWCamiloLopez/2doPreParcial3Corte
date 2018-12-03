/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.dopreparcial3corte.controller;

import com.google.gson.Gson;
import edu.eci.arsw.dopreparcial3corte.model.Cadena;
import edu.eci.arsw.dopreparcial3corte.services.Services;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author camilo
 */
@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @Autowired
    Services services;

    /**
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, path = "/cadenas")
    public ResponseEntity<?> obtenerUltimas10Cadenas() {
        try {
            Map<String, Cadena> cadenas = new HashMap();

            List<Cadena> listaCadenas = new ArrayList<>();
            listaCadenas.addAll(services.obtenerLasUltimas10Cadenas());

            for (Cadena x : listaCadenas) {
                cadenas.put(x.getIdCadena(), x);
            }

            String codeToJson = new Gson().toJson(cadenas);

            return new ResponseEntity<>(codeToJson, HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(ApiController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No se han podido obtener las cadenas", HttpStatus.NOT_FOUND);
        }
    }

    /**
     *
     * @param cadena
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, path = "/agregarCadena")
    public ResponseEntity<?> agregarNuevaCadena(@RequestBody String cadena) {
        try {

            //Pasar el String JSON a un Map
            Type listType = new TypeToken<Map<Integer, Cadena>>() {
            }.getType();
            Map<Integer, Cadena> result = new Gson().fromJson(cadena, listType);

            //Obtener las llaves del Map
            Object[] nameKeys = result.keySet().toArray();

            //Añadir el producto a la orden obteniendo los objetos en el Map
            services.crearNuevaCadena(result.get(nameKeys[0]));

            return new ResponseEntity<>(HttpStatus.CREATED);

        } catch (Exception ex) {
            Logger.getLogger(ApiController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No se ha podido crear la nueva cadena", HttpStatus.FORBIDDEN);
        }
    }

}
