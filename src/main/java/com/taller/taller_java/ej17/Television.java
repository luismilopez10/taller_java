package com.taller.taller_java.ej17;

public class Television extends Electrodomestico {
    private static final Integer RESOLUCION = 20;
    private static final Boolean SINTONIZADOR_TDT = false;

    private Integer resolucion = RESOLUCION;
    private Boolean sintonizadorTdt = SINTONIZADOR_TDT;

    public Television() {
    }

    public Television(Integer precioBase, Integer peso) {
        super(precioBase, peso);
    }

    public Television(Integer precioBase, String color, Character consumoEnergetico, Integer peso, Integer resolucion, Boolean sintonizadorTdt) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public Double fncPrecioFinal(){
        Double precioFinal = super.fncPrecioFinal();
        if (this.resolucion > 40){
            precioFinal *= 1.3;
        }
        if (this.sintonizadorTdt){
            precioFinal += 50;
        }
        return precioFinal;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizadorTdt() {
        return sintonizadorTdt;
    }
}
