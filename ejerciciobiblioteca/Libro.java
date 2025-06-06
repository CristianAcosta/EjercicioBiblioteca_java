package com.mycompany.ejerciciobiblioteca;

/**
 *
 * @author Camilo
 */
public class Libro extends Publicacion {
    private String autor;
    private String referenciaBibliografica;
    private String editorial;
    public Libro(String titulo, String autor, String editorial, String referenciaBibliografica, int anioPublicacion) {
        super(titulo, anioPublicacion);
        this.autor = autor;
        this.editorial = editorial; // Inicializar correctamente
        this.referenciaBibliografica = referenciaBibliografica; // Inicializar correctamente
    }
    @Override
    public void imprimir() {
        System.out.println("--- Libro ---");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        System.out.println("Referencia Bibliográfica: " + referenciaBibliografica);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println();
    }
}
