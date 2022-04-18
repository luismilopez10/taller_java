package com.taller.taller_java;

import javax.swing.*;
import java.util.Locale;

/*
 * Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola, indicar cual es la
 * longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
 */

public class ej11 {
    public static void main(String[] args) {
        String phrase = JOptionPane.showInputDialog("Ingrese una frase");
        int length = phrase.length();
        boolean vocalA = phrase.toLowerCase(Locale.ROOT).contains("a");
        boolean vocalE = phrase.toLowerCase(Locale.ROOT).contains("e");
        boolean vocalI = phrase.toLowerCase(Locale.ROOT).contains("i");
        boolean vocalO = phrase.toLowerCase(Locale.ROOT).contains("o");
        boolean vocalU = phrase.toLowerCase(Locale.ROOT).contains("u");

        System.out.println("La longitud de la frase es " + length + ", y con tiene las vocales: " + "\n"
                + "a: " + vocalA + "\n"
                + "e: " + vocalE + "\n"
                + "i: " + vocalI + "\n"
                + "o: " + vocalO + "\n"
                + "u: " + vocalU + "\n");
    }
}
