/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exception.excepciones;

/**
 *
 * @author Christian
 */
public class ExcepcionDividirPorUno extends RuntimeException{
    public ExcepcionDividirPorUno(){
        this("No voy a "); // retorna el valor
    }
    public ExcepcionDividirPorUno(String str) {
        super(str + "No voy a dividir por uno.");
    }
}
