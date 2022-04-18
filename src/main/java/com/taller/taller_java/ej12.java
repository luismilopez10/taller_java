package com.taller.taller_java;

import org.apache.commons.lang3.StringUtils;

/*
 * Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
 */

import javax.swing.*;

public class ej12 {
    public static void main(String[] args) {
        String word1 = JOptionPane.showInputDialog("Ingrese la primera palabra");
        String word2 = JOptionPane.showInputDialog("Ingrese la segunda palabra");
        System.out.println("Las dos palabras se diferencian en: " + "'" + StringUtils.difference(word1,word2) + "'");
    }
}
