package com.taller.taller_java;

/*
 * Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
 * Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
 */

public class ej1 {
    public static void main(String[] args) {
        int x = 0;
        int y = -5;
        String result = "Son iguales";

        if (x != y){
            result = "El número mayor es: " +  String.valueOf(fncGreater(x,y));
        }

        System.out.println(result);
    }

    static int fncGreater(int x, int y){
        return x>y ? x : y;
    }
}
