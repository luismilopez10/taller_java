package com.taller.taller_java;

import java.util.Scanner;

/*
 * Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.
 */

public class ej2 {
    public static void main(String[] args){
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        x = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        y = scanner.nextInt();

        System.out.println(fncCompare(x, y));
    }

    static String fncCompare(int x, int y){
        if (x > y){
            return "El número mayor es: " + x;
        }
        if (y > x){
            return "El número mayor es: " + y;
        }
        return "Los números son iguales";
    }
}
