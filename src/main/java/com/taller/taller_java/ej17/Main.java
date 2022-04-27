package com.taller.taller_java.ej17;

public class Main {
    public static void main(String[] args) {
        Electrodomestico lstElectrodomestico[] = new Electrodomestico[10];
        lstElectrodomestico[0] = new Television();
        lstElectrodomestico[1] = new Television(150,10);
        lstElectrodomestico[2] = new Television(210,"NEGRO",'C',25,45,true);
        lstElectrodomestico[3] = new Television(105,"MORADO",'J',10,32,false);
        lstElectrodomestico[4] = new Television(250,17);
        lstElectrodomestico[5] = new Lavadora();
        lstElectrodomestico[6] = new Lavadora(400,35);
        lstElectrodomestico[7] = new Lavadora(300,"BLANCO",'B',30,20);
        lstElectrodomestico[8] = new Lavadora(450,"GRIS",'A',45,40);
        lstElectrodomestico[9] = new Lavadora(200,25);

        System.out.println("El precio de los electrodomésticos es: " + fncPrecioElectrodomestico(lstElectrodomestico) + "€");
        System.out.println("El precio de los televisores es: " + fncPrecioTelevision(lstElectrodomestico) + "€");
        System.out.println("El precio de las lavadoras es: " + fncPrecioLavadora(lstElectrodomestico) + "€");
    }

    private static Double fncPrecioElectrodomestico(Electrodomestico lstElectrodomestico[]){
        Double precio = 0.0;
        for (Electrodomestico electrodomestico : lstElectrodomestico) {
            precio += electrodomestico.fncPrecioFinal();
        }
        return precio;
    }

    private static Double fncPrecioTelevision(Electrodomestico lstElectrodomestico[]){
        Double precio = 0.0;
        for (Electrodomestico electrodomestico : lstElectrodomestico) {
            if (electrodomestico instanceof Television) {
                precio += electrodomestico.fncPrecioFinal();
            }
        }
        return precio;
    }

    private static Double fncPrecioLavadora(Electrodomestico lstElectrodomestico[]){
        Double precio = 0.0;
        for (Electrodomestico electrodomestico : lstElectrodomestico) {
            if (electrodomestico instanceof Lavadora) {
                precio += electrodomestico.fncPrecioFinal();
            }
        }
        return precio;
    }
}
