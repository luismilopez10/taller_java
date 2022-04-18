package com.taller.taller_java;

import javax.swing.*;

/*
 * Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a del String anterior por una e,
 * adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.
 */

public class ej9 {
    public static void main(String[] args) {
        String phrase = fncReplaceChar("La sonrisa sera la mejor arma contra la tristeza",'a','e');
        String newPhrase = phrase.concat(" " + JOptionPane.showInputDialog("Ingrese la frase a concatenar"));
        System.out.println(phrase);
        System.out.println(newPhrase);
    }

    static String fncReplaceChar(String phrase, char from, char to){
        phrase = phrase.replace(from, to);
        return phrase;
    }
}
