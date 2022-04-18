package com.taller.taller_java;

import javax.swing.*;

/*
 * Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.
 * El IVA sera una constante que sera del 21%.
 */

public class ej4 {
    public static void main(String[] args) {
        String precio = JOptionPane.showInputDialog("Ingrese el precio del producto");
        double precioConIVA = fncCalcularPrecioConIVA(Double.parseDouble(precio));

        System.out.println("El precio del producto con IVA es: $" + precioConIVA);
    }

    public static double fncCalcularPrecioConIVA(double precio){
        final double IVA = 21;
        return precio * (IVA/100+1);
    }
}
