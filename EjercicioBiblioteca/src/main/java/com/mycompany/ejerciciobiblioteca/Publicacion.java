package com.mycompany.ejerciciobiblioteca;
import java.util.ArrayList;
/**
 *
 * @author Camilo
 */
public abstract class Publicacion {
    // Atributos comunes a libros y revistas
    protected String titulo;
    protected int anioPublicacion;

    // Constructor que inicializa atributos comunes
    public Publicacion(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    // Métodos getter para acceder a atributos si se desea
    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Método abstracto para que las subclases lo implementen y muestren su info
    public abstract void imprimir();
}
    

