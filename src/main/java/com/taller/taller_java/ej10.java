package com.taller.taller_java;

import javax.swing.*;

/*
 * Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.
 */

public class ej10 {
    public static void main(String[] args) {
        System.out.println(fncDeleteBlankSpaces(JOptionPane.showInputDialog("Ingrese una frase")));
    }

    static String fncDeleteBlankSpaces(String phrase){
        return phrase.replace(" ", "");
    }
}
