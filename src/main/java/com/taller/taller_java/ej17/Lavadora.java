package com.taller.taller_java.ej17;

public class Lavadora extends Electrodomestico {
    private static final Integer CARGA = 5;

    private Integer carga = CARGA;

    public Lavadora() {
    }

    public Lavadora(Integer precioBase, Integer peso) {
        super(precioBase, peso);
    }

    public Lavadora(Integer precioBase, String color, Character consumoEnergetico, Integer peso, Integer carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public Double fncPrecioFinal(){
        if (this.carga > 30){
            return super.fncPrecioFinal() + 50;
        }
        return super.fncPrecioFinal();
    }
}
