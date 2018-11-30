/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.dopreparcial3corte.model;

import java.util.Date;
import org.springframework.data.annotation.Id;

/**
 *
 * @author camilo
 */
public class Cadena {

    @Id
    private Integer idCadena;

    private String contenidoCadena;
    private Date fechaCadena;

    public Cadena(Integer idCadena, String contenidoCadena, Date fechaCadena) {
        this.idCadena = idCadena;
        this.contenidoCadena = contenidoCadena;
        this.fechaCadena = fechaCadena;
    }

    public Integer getIdCadena() {
        return idCadena;
    }

    public void setIdCadena(Integer idCadena) {
        this.idCadena = idCadena;
    }

    public String getContenidoCadena() {
        return contenidoCadena;
    }

    public void setContenidoCadena(String contenidoCadena) {
        this.contenidoCadena = contenidoCadena;
    }

    public Date getFechaCadena() {
        return fechaCadena;
    }

    public void setFechaCadena(Date fechaCadena) {
        this.fechaCadena = fechaCadena;
    }

}
