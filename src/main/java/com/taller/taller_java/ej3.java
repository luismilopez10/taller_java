package com.taller.taller_java;

import javax.swing.JOptionPane;

/*
 * Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda
 * pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
 */

public class ej3 {
    public static void main(String[] args) {
        String radio = JOptionPane.showInputDialog("Ingrese el radio");

        System.out.println("El área del círculo de radio: " + radio + " es: "
                + (fncCalcularArea(Double.parseDouble(radio))) + " cm^2");
    }

    public static double fncCalcularArea(double radio){
        return Math.PI * Math.pow(radio, 2);
    }
}
