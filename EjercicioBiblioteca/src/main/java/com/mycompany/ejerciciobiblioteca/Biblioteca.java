package com.mycompany.ejerciciobiblioteca;
import java.util.ArrayList;
/**
 *
 * @author Camilo
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> coleccionLibros;
    private ArrayList<Revista> coleccionRevistas;
    private ArrayList<Revista> revistas = new ArrayList<>();

    public ArrayList<Revista> getRevistas() {
        return revistas;
    }

    public void setRevistas(ArrayList<Revista> revistas) {
        this.revistas = revistas;
    }

    // Constructor que inicializa las colecciones vacías
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        coleccionLibros = new ArrayList<>();
        coleccionRevistas = new ArrayList<>();
    }

    // Método para agregar un libro a la colección
    public void agregarLibro(Libro libro) {
        coleccionLibros.add(libro);
    }

    // Método para agregar una revista a la colección
    public void agregarRevista(Revista revista) {
        coleccionRevistas.add(revista);
    }

    // Método para mostrar todos los libros en la biblioteca
    public void mostrarLibros() {
        System.out.println("Libros en la biblioteca " + nombre + ":");
        System.out.println("======================================");
        if (coleccionLibros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro libro : coleccionLibros) {
                libro.imprimir();
            }
        }
    }

    // Método para mostrar todas las revistas en la biblioteca
    public void mostrarRevistas() {
        System.out.println("Revistas en la biblioteca " + nombre + ":");
        System.out.println("=========================================");
        if (coleccionRevistas.isEmpty()) {
            System.out.println("No hay revistas en la biblioteca.");
        } else {
            for (Revista revista : coleccionRevistas) {
                revista.imprimir();
            }
        }
    }
}


