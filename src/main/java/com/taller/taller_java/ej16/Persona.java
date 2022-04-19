package com.taller.taller_java.ej16;

import org.apache.commons.lang3.StringUtils;
import static java.lang.Double.isNaN;

public class Persona {
    private String name = StringUtils.EMPTY;
    private int age = 0;
    private String DNI;
    private char gender = 'H';
    private double weight = 0;
    private double height = 0;

    public Persona(){this.DNI = fncGenerateDNI();}

    public Persona(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.DNI = fncGenerateDNI();
    }

    public Persona(String name, int age, char gender,double weight, double height){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.DNI = fncGenerateDNI();
    }

    public int fncCalcIMC(){
        double IMC = this.weight/Math.pow(this.height,2);
        IMC = isNaN(IMC) ? 0 : IMC;
        return IMC<20 ? -1 : (IMC>25 ? 1 : 0);
    }

    public boolean fncIsAdult(){
        return this.age>=18 ? true : false;
    }

    public char fncCheckGender(char gender){
        if (gender != 'H' && gender != 'M'){
            gender = 'H';
        }
        return gender;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", DNI='" + DNI + '\'' +
                ", gender=" + gender +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    private String fncGenerateDNI(){
        int DNI = (int) (Math.random() * 100000000);
        return String.valueOf(DNI);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
