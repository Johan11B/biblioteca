package org.example;
    //definiendo la clase libro
public class Libro {
    //Definiendo sus atributos (privados)
    private String titulo;
    private String autor;
    private int id;
    private int anioPublicacion;
    private boolean disponible;
    private String genero;
    //Método constructor
    public Libro(String titulo, String autor, int anioPublicacion, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
        this.genero = genero;
    }

    // Getters y Setters para acceder y modificar los atributos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    //Método que retorna la información de la instancia de la clase libro
    @Override
    public String toString() {
        return "->Título: " + titulo + " | Autor: " + autor +
                " |  Año: " + anioPublicacion + " |  Género: " + genero;
    }

    }
