package com.taller.taller_java.ej16;

import org.apache.commons.lang3.StringUtils;
import static java.lang.Double.isNaN;

public class Persona {
    private static final String NAME = StringUtils.EMPTY;
    private static final Integer AGE = 0;
    private static final Character GENDER = 'H';
    private static final Double WEIGHT = 0.0;
    private static final Double HEIGHT = 0.0;

    private String name = NAME;
    private Integer age = AGE;
    private String DNI;
    private Character gender = GENDER;
    private Double weight = WEIGHT;
    private Double height = HEIGHT;

    public Persona(){this.DNI = fncGenerateDNI();}

    public Persona(String name, Integer age, Character gender){
        this.name = name;
        this.age = age;
        this.gender = fncCheckGender(gender);
        this.DNI = fncGenerateDNI();
    }

    public Persona(String name, Integer age, Character gender,Double weight, Double height){
        this.name = name;
        this.age = age;
        this.gender = fncCheckGender(gender);
        this.weight = weight;
        this.height = height;
        this.DNI = fncGenerateDNI();
    }

    private Character fncCheckGender(Character gender){
        return gender != 'H'
                && gender != 'M'
                ? 'H' : gender;
    }

    private String fncGenerateDNI(){
        Integer DNI = (int) (Math.random() * 100000000);
        return fncGenerateLetterFromNumber(DNI);
    }

    private String fncGenerateLetterFromNumber(Integer num){
        String DNI = "";
        String number = String.valueOf(num);
        for (char ch: number.toCharArray()) {
            DNI = DNI + (char) ((int)ch + 17);
        }
        return DNI;
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

    public int fncCalcIMC(){
        Double IMC = this.weight/Math.pow(this.height,2);
        IMC = isNaN(IMC) ? 0 : IMC;
        return IMC<20 ? -1 : (IMC>25 ? 1 : 0);
    }

    public boolean fncIsAdult(){
        return this.age>=18 ? true : false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
