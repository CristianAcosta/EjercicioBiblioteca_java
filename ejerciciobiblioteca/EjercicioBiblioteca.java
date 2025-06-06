package com.mycompany.ejerciciobiblioteca;
/**
 *
 * @author Camilo
 */
public class EjercicioBiblioteca {

    public static void main(String[] args) {
        // Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional");
        
        // Crear un libro agregando todos sus atributos
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez",
                                 "Sudamericana", "858.67/M566", 1967);
        
        // Agregar libro a la biblioteca
        biblioteca.agregarLibro(libro1); 
        
        // Crear una revista con sus atributos específicos
        Revista revista1 = new Revista("National Geographic", 2023, "Mensual",
                "National Geographic Partners", "Estados Unidos");
        
        // Agregar revista a la biblioteca
        biblioteca.agregarRevista(revista1); 
        
        // Mostrar todas las publicaciones
        biblioteca.mostrarLibros();
        biblioteca.mostrarRevistas();
    }
}