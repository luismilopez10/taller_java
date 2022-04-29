package com.taller.taller_java.ej18;

public class Videojuego implements IEntregable {
    private static final Double HORAS_ESTIMADAS = 10.0;
    private final static Boolean PRESTADO = false;

    private String titulo = "";
    private Double horasEstimadas = HORAS_ESTIMADAS;
    private Boolean prestado = PRESTADO;
    private String genero = "";
    private String compania = "";

    public Videojuego() {
    }

    public Videojuego(String titulo, Double horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, Double horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(Double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + prestado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public Boolean isEntregado() {
        return this.prestado;
    }

    @Override
    public String compareTo(Object object) {
        Videojuego videojuego = (Videojuego) object;
        return this.titulo + " tiene " + this.horasEstimadas.toString() + " horas estimadas de juego / " +
                videojuego.titulo + " tiene " + videojuego.horasEstimadas.toString() + " horas estimadas de juego";
    }
}
