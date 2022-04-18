package com.taller.taller_java;

/*
 * Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while
 */

public class ej5 {
    public static void main(String[] args) {
        fncParImpar(1,100);
    }

    public static void fncParImpar(int inicio, int fin){
        while (inicio <= fin){
            if (inicio%2==0) {
                System.out.println(inicio + " es par");
                inicio++;
                continue;
            }
            System.out.println(inicio + " es impar");
            inicio++;
        }
    }
}
