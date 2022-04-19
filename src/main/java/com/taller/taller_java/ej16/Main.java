package com.taller.taller_java.ej16;

import javax.swing.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Ingrese el nombre");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        char gender = JOptionPane.showInputDialog("Ingrese el género (H/M)").toUpperCase(Locale.ROOT).charAt(0);
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso en kilogramos"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura en metros (indique decimal con punto '.'"));

        Persona persona1 = new Persona(name, age, gender, weight, height);
        Persona persona2 = new Persona(name, age, gender);
        Persona persona3 = new Persona();
        persona3.setName("José");
        persona3.setAge(21);
        persona3.setGender('H');
        persona3.setWeight(128);
        persona3.setHeight(1.72);

        // Comprobando peso de las personas:
        System.out.println(fncIMCPersona(persona1));
        System.out.println(fncIMCPersona(persona2));
        System.out.println(fncIMCPersona(persona3));
    }

    static String fncIMCPersona(Persona persona){
        int IMC = persona.fncCalcIMC();
        if (IMC == -1){
            return "Peso bajo";
        }
        if (IMC == 0){
            return "Peso ideal";
        }
        return "Sobrepeso";
    }
}
