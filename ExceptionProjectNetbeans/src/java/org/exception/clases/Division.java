/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exception.clases;

import org.exception.excepciones.ExcepcionDividirPorUno;

/**
 *
 * @author Christian
 */
public class Division {

    private int dividendo, divisor;
    
    public Division() {
    }

    // Se genera la excepcion en la capa presentacion
    public Division(String a, String b) throws NumberFormatException{
        dividendo = Integer.parseInt(a);
        divisor = Integer.parseInt(b);
    }
    
    public String dividir() throws ArithmeticException, ExcepcionDividirPorUno{
        int resultado = 0;
        if (divisor==1) {
            throw new ExcepcionDividirPorUno("Esto no es un reto");
        } else {
            resultado = dividendo /divisor;
        }
        resultado = dividendo / divisor;
        return Integer.toString(resultado);
    }
    
}
