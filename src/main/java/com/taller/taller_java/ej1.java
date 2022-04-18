package com.taller.taller_java;

/*
 * Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
 * Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
 */

public class ej1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;

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
