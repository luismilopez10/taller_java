package com.taller.taller_java;

/*
 * Hacer un programa que muestre el siguiente menú de opciones
 ****** GESTION CINEMATOGRÁFICA ********
 * 1-NUEVO ACTOR
 * 2-BUSCAR ACTOR
 * 3-ELIMINAR ACTOR
 * 4-MODIFICAR ACTOR
 * 5-VER TODOS LOS ACTORES
 * 6-VER PELICULAS DE LOS ACTORES
 * 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
 * 8-SALIR

 * EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR
 * MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE
 * "OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE. PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.
 */

import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        fncPrintMenu();
        fncChooseOption();
    }

    static void fncChooseOption() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.print("\nElija una opción del menú: ");
            option = scanner.nextInt();
            switch (option) {
                case 1,2,3,4,5,6,7:
                    fncPrintMenu();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("OPCIÓN INCORRECTA\n");
                    fncPrintMenu();
                    break;
            }
        }while (option!=8);
    }

    static void fncPrintMenu(){
        System.out.println(
                "\n****** GESTION CINEMATOGRÁFICA ********" + "\n" +
                "1-NUEVO ACTOR" + "\n" +
                "2-BUSCAR ACTOR" + "\n" +
                "3-ELIMINAR ACTOR" + "\n" +
                "4-MODIFICAR ACTOR" + "\n" +
                "5-VER TODOS LOS ACTORES" + "\n" +
                "6-VER PELICULAS DE LOS ACTORES" + "\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES" + "\n" +
                "8-SALIR");
    }
}
