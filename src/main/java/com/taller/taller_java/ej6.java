package com.taller.taller_java;

/*
 * Realiza el ejercicio anterior usando un ciclo for.
 */

public class ej6 {
    public static void main(String[] args) {
        fncParImpar(1,100);
    }

    public static void fncParImpar(int inicio, int fin){
        for (int i=inicio; i <= fin; i++){
            if (i%2==0) {
                System.out.println(i + " es par");
                continue;
            }
            System.out.println(i + " es impar");
        }
    }
}
