package com.taller.taller_java.ej16;

import javax.swing.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Ingrese el nombre");
        Integer age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        Character gender = JOptionPane.showInputDialog("Ingrese el género (H/M)").toUpperCase(Locale.ROOT).charAt(0);
        Double weight = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso en kilogramos"));
        Double height = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura en metros (indique decimal con punto '.'"));

        Persona persona1 = new Persona(name, age, gender, weight, height);
        Persona persona2 = new Persona(name, age, gender);
        Persona persona3 = new Persona();
        persona3.setName("José");
        persona3.setAge(15);
        persona3.setGender('H');
        persona3.setWeight(85.0);
        persona3.setHeight(1.72);

        // Comprobando estado de peso de las personas:
        System.out.println(fncPrintIMCPersona(persona1));
        System.out.println(fncPrintIMCPersona(persona2));
        System.out.println(fncPrintIMCPersona(persona3));

        // Comprobando si es mayor de edad:
        System.out.println(fncPrintIsAdult(persona1));
        System.out.println(fncPrintIsAdult(persona2));
        System.out.println(fncPrintIsAdult(persona3));

        // Información de cada persona:
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
    }

    static String fncPrintIMCPersona(Persona persona){
        Integer IMC = persona.fncCalcIMC();
        if (IMC == -1){
            return "Peso bajo";
        }
        if (IMC == 0){
            return "Peso ideal";
        }
        return "Sobrepeso";
    }

    static String fncPrintIsAdult(Persona persona){
        if (persona.fncIsAdult()){
            return "Es adulto";
        }
        return "No es adulto";
    }
}
