package com.taller.taller_java;

/*
 * Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while
 */

public class ej5 {
    public static void main(String[] args) {
        fncOddCouple(1,100);
    }

    public static void fncOddCouple(int first, int last){
        while (first <= last){
            String result = first%2==0 ? " es par" : " es impar";
            System.out.println(first + result);
            first++;
        }
    }
}
