package com.taller.taller_java.ej17;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class Electrodomestico {
    private static final Integer PRECIO_BASE = 100;
    private static final Color COLOR = Color.BLANCO;
    private static final ConsumoEnergetico CONSUMO_ENERGETICO = ConsumoEnergetico.F;
    private static final Integer PESO = 5;

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

    public Electrodomestico(Integer precioBase, String color, Character consumoEnergetico, Integer peso) {
        this.precioBase = precioBase;
        fncComprobarColor(color);
        fncComprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    private void fncComprobarConsumoEnergetico(Character letra){
        // Se comprueba si "letra" se encuentra en el enum "ConsumoEnergetico", sino retorna null.
        ConsumoEnergetico enumExiste = Arrays.stream(ConsumoEnergetico.values())
                .filter(v -> Character.toString(letra).equalsIgnoreCase(v.name()))
                .findFirst().orElse(null);
        if (enumExiste != null){
            this.consumoEnergetico = enumExiste;
        }
    }

    private void fncComprobarColor(String color){
        // Se comprueba si "color" se encuentra en el enum "Color", sino retorna null.
        Color enumExiste = Arrays.stream(Color.values())
                .filter(v -> color.equalsIgnoreCase(v.name()))
                .findFirst().orElse(null);
        if (enumExiste != null){
            this.color = enumExiste;
        }
    }

    private Integer fncPrecioPorConsumoEnergetico(){
        EnumMap<ConsumoEnergetico, Integer> precio = new EnumMap<>(ConsumoEnergetico.class);
        precio.put(ConsumoEnergetico.A, 100);
        precio.put(ConsumoEnergetico.B, 80);
        precio.put(ConsumoEnergetico.C, 60);
        precio.put(ConsumoEnergetico.D, 50);
        precio.put(ConsumoEnergetico.E, 30);
        precio.put(ConsumoEnergetico.F, 10);

        return precio.get(this.consumoEnergetico);
    }

    private Integer fncPrecioPorPeso(){
        Map<Boolean, Integer> precio = new HashMap<>();
        precio.put(this.peso>=0 && this.peso<=19, 10);
        precio.put(this.peso>=20 && this.peso<=49, 50);
        precio.put(this.peso>=50 && this.peso<=79, 80);
        precio.put(this.peso>=80, 100);

        return precio.get(true);
    }

    public Double fncPrecioFinal(){
        Integer precioPorConsumoEnergetico = fncPrecioPorConsumoEnergetico();
        Integer precioPorPeso = fncPrecioPorPeso();
        return (double) this.precioBase + precioPorConsumoEnergetico + precioPorPeso;
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
}
