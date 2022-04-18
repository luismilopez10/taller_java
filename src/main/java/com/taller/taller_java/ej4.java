package com.taller.taller_java;

import javax.swing.*;

/*
 * Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.
 * El IVA sera una constante que sera del 21%.
 */

public class ej4 {
    public static void main(String[] args) {
        double price = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
        double finalPrice = fncCalcFinalPrice(price);

        System.out.println("El precio del producto con IVA es: $" + finalPrice);
    }

    public static double fncCalcFinalPrice(double price){
        final double IVA = 0.21;
        return price * (IVA+1);
    }
}
