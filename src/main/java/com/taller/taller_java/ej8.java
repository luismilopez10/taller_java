package com.taller.taller_java;

import javax.swing.*;
import java.util.Locale;

/*
 * Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un día laboral o no.
 * Usa un switch para ello.
 */

public class ej8 {
    public static void main(String[] args) {
        fncWorkDay();
    }

    static void fncWorkDay(){
        String day = JOptionPane.showInputDialog("Ingrese un día de la semana");
        switch (day.toLowerCase(Locale.ROOT)) {
            case "lunes":
                System.out.println("Día laboral");
                break;
            case "martes":
                System.out.println("Día laboral");
                break;
            case "miercoles":
                System.out.println("Día laboral");
                break;
            case "jueves":
                System.out.println("Día laboral");
                break;
            case "viernes":
                System.out.println("Día laboral");
                break;
            case "sabado":
                System.out.println("Día no laboral");
                break;
            case "domingo":
                System.out.println("Día no laboral");
                break;
        }
    }
}
