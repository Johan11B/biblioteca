package org.example;

public class Libro {

    private String titulo;
    private String autor;
    private int id;
    private boolean disponible;

    public Libro(String titulo, String autor, int id) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.disponible = true;
    }
}
