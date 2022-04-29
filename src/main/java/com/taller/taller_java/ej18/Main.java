package com.taller.taller_java.ej18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IEntregable lstSeries[] = new Serie[5];
        lstSeries[0] = new Serie("Breaking Bad", 5, "Drama", "George Vince Gilligan");
        lstSeries[1] = new Serie("Mr Robot", 4, "Drama", "Sam Esmail");
        lstSeries[2] = new Serie("Game of Thrones", 8, "Drama", "George R.R");
        lstSeries[3] = new Serie("The Witcher", "Andrzej Sapkowski");
        lstSeries[4] = new Serie("Sense 8", "Hermanas Wachowski & J. Michael Straczynski");
        IEntregable lstVideojuegos[] = new Videojuego[5];
        lstVideojuegos[0] = new Videojuego("Metal Gear Solid", 11.5, "Acción", "Konami");
        lstVideojuegos[1] = new Videojuego("Final Fantasy X", 45.0, "Aventura", "Squaresoft");
        lstVideojuegos[2] = new Videojuego("Super Mario 64", 13.0, "Aventura", "Nintendo");
        lstVideojuegos[3] = new Videojuego("Crash Bandicoot 2", 20.5, "Aventura", "Naughty Dog");
        lstVideojuegos[4] = new Videojuego("Final Fantasy IX", 40.0);

        lstSeries[1].entregar();
        lstSeries[3].entregar();
        lstSeries[4].entregar();
        lstVideojuegos[0].entregar();
        lstVideojuegos[2].entregar();
        lstVideojuegos[3].entregar();
        lstVideojuegos[4].entregar();

        Long seriesEntregadas = Arrays.stream(lstSeries).filter(serie -> serie.isEntregado()).count();
        Arrays.stream(lstSeries).filter(serie -> serie.isEntregado()).forEach(serie -> serie.devolver());

        Long videojuegosEntregados = Arrays.stream(lstVideojuegos).filter(videojuego -> videojuego.isEntregado()).count();
        Arrays.stream(lstVideojuegos).filter(videojuego -> videojuego.isEntregado()).forEach(videojuego -> videojuego.devolver());
    }
}
