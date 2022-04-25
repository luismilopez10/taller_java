package com.taller.taller_java.ej17;

import java.util.Arrays;
import java.util.Locale;

public class Electrodomestico {
    private final static Integer PRECIO_BASE = 100;
    private final static Color COLOR = Color.BLANCO;
    private final static ConsumoEnergetico CONSUMO_ENERGETICO = ConsumoEnergetico.F;
    private final static Integer PESO = 5;

    protected Integer precioBase = PRECIO_BASE;

    protected Color color = COLOR;
    protected ConsumoEnergetico consumoEnergetico = CONSUMO_ENERGETICO;
    protected Integer peso = PESO;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(Integer precioBase, String color, char consumoEnergetico, Integer peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }


    public Integer getPrecioBase() {
        return precioBase;
    }

    public Color getColor() {
        return color;
    }

    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    private void comprobarConsumoEnergetico(char letra){
        ConsumoEnergetico enumz = Arrays.stream(ConsumoEnergetico.values())
                .filter(v -> Character.toString(letra).equalsIgnoreCase(v.name()))
                .findFirst().orElse(null);
        if (enumz != null){
            this.consumoEnergetico=enumz;
        }
    }

    private void comprobarColor(String color){
        Color enumz = Arrays.stream(Color.values())
                .filter(v -> color.equalsIgnoreCase(v.name()))
                .findFirst().orElse(null);
        if (enumz != null){
            this.color=enumz;
        }
    }

    private void precioFinal(){

    }
}
