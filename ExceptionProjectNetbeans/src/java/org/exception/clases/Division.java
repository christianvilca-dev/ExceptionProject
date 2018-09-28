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
        try {
            dividendo = Integer.parseInt(a);
            divisor = Integer.parseInt(b);
        } catch (NumberFormatException nfe) {
            System.err.println("Error de nde: " + nfe.getMessage());
        }
    }
    
    public String dividir(){
        int resultado = 0;
        try {
            resultado = dividendo / divisor;
        } catch (ArithmeticException ae) {
            System.err.println("Error de division por cero: " + ae.getMessage());
        }
        return Integer.toString(resultado);
    }
    
}
