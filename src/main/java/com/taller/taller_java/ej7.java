package com.taller.taller_java;

import javax.swing.*;

/*
 * Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a
 * pedir (do while), después muestra ese número por consola.
 */

public class ej7 {
    public static void main(String[] args) {
        fncGreaterThanZero();
    }

    static void fncGreaterThanZero(){
        double num;
        do {
            num =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número"));
        }while (num<0);
        System.out.println(num);
    }
}
