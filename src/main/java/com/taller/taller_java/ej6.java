package com.taller.taller_java;

/*
 * Realiza el ejercicio anterior usando un ciclo for.
 */

public class ej6 {
    public static void main(String[] args) {
        fncOddCouple(1,100);
    }

    public static void fncOddCouple(int first, int last){
        for (int i=first; i <= last; i++){
            String result = i%2==0 ? " es par" : " es impar";
            System.out.println(i + result);
        }
    }
}
