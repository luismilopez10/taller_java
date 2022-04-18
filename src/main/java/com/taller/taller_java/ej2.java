package com.taller.taller_java;

import java.util.Scanner;

/*
 * Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.
 */

public class ej2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int x = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int y = scanner.nextInt();

        String respuesta = "Son iguales";

        if (x != y){
            respuesta = "El número mayor es: " +  String.valueOf(fncBiggerNumber(x,y));
        }

        System.out.println(respuesta);
    }

    public static int fncBiggerNumber(int x, int y){
        return x>y ? x : y;
    }
}
