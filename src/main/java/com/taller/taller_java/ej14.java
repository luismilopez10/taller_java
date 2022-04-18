package com.taller.taller_java;

import javax.swing.*;

/*
 * Crear un programa que pida un número por teclado y que imprima por pantalla los números desde el número
 * introducido hasta 1000 con saldos de 2 en 2.
 */

public class ej14 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de inicio"));
        for (int i=num; i <= 1000; i = i+2){
            System.out.println(i);
        }
    }
}
