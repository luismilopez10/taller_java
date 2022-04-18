package com.taller.taller_java;

import javax.swing.JOptionPane;

/*
 * Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda
 * pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
 */

public class ej3 {
    public static void main(String[] args) {
        String ratio = JOptionPane.showInputDialog("Ingrese el radio");

        System.out.println("El área del círculo de radio: " + ratio + " es: "
                + (fncCalcArea(Double.parseDouble(ratio))) + " cm^2");
    }

    public static double fncCalcArea(double ratio){
        return Math.PI * Math.pow(ratio, 2);
    }
}
