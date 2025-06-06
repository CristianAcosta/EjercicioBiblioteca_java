package com.mycompany.ejerciciobiblioteca;

/**
 *
 * @author Camilo
 */
public class Revista extends Publicacion {
    private String periodicidad;
    private String editorial;
    private String pais;

    // Constructor que inicializa atributos específicos y llama a la superclase
    public Revista(String nombre, int anioPublicacion, String periodicidad, String editorial, String pais) {
        super(nombre, anioPublicacion);
        this.periodicidad = periodicidad;
        this.editorial = editorial;
        this.pais = pais;
    }

    // Método para imprimir la información de la revista
    @Override
    public void imprimir() {
        System.out.println("--- Revista ---");
        System.out.println("Nombre: " + titulo);
        System.out.println("Año de publicacion: " + anioPublicacion);
        System.out.println("Periodicidad: " + periodicidad);
        System.out.println("Editorial: " + editorial);
        System.out.println("País: " + pais);
        System.out.println();
    }

}
