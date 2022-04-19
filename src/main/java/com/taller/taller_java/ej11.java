package com.taller.taller_java;

import javax.swing.*;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

/*
 * Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola, indicar cual es la
 * longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
 */

public class ej11 {
    public static void main(String[] args) {
        String phrase = JOptionPane.showInputDialog("Ingrese una frase");
        System.out.println("La frase tiene " + phrase.length() + " letras");
        fncVowelCounter(phrase);
    }

    static void fncVowelCounter(String phrase) {
        int vowelACounter = StringUtils.countMatches(phrase.toLowerCase(Locale.ROOT), "a");
        int vowelECounter = StringUtils.countMatches(phrase.toLowerCase(Locale.ROOT), "e");
        int vowelICounter = StringUtils.countMatches(phrase.toLowerCase(Locale.ROOT), "i");
        int vowelOCounter = StringUtils.countMatches(phrase.toLowerCase(Locale.ROOT), "o");
        int vowelUCounter = StringUtils.countMatches(phrase.toLowerCase(Locale.ROOT), "u");

        System.out.println("Las vocales se repiten: \n" +
                vowelACounter + " veces 'A',\n" +
                vowelECounter + " veces 'E',\n" +
                vowelICounter + " veces 'I',\n" +
                vowelOCounter + " veces 'O',\n" +
                vowelUCounter + " veces 'U'.");
    }
}
