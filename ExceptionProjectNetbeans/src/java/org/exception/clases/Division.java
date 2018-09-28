/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exception.clases;

/**
 *
 * @author Christian
 */
public class Division {

    private int dividendo, divisor;
    
    public Division() {
    }

    public Division(String a, String b) {
        dividendo = Integer.parseInt(a);
        divisor = Integer.parseInt(b);
    }
    
    public String dividir(){
        int resultado = 0;
        resultado = dividendo / divisor;
        return Integer.toString(resultado);
    }
    
}
