package es.ifp.programacion.uf4.poo.ejemplos.ejercicio1;

import java.util.Date;

import es.ifp.programacion.uf4.poo.ejemplos.ejercicio1.clases.Libro;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		String titulo;
		String autor;
		String isbn;
		String editorial;
		String sinopsis;
		Date fechaPubli;
		float precio;
		
		Libro libro1 = new Libro("2666", "Roberto Bolaño", "Anagrama", "A cuatro profesores de literatura (...)", 40);
		
		Libro libro2 = new Libro("El peligro de estar cuerda", "Rosa Montero", "Seix Barral", "El peligro de estar cuerda habla (...)", 19.85f);
		
		
		titulo = libro1.getTitulo();
		System.out.println("El título del libro es: "+titulo);
		
		autor = libro1.getAutor();
		System.out.println("El autor del libro es: "+autor);
		
		isbn = libro1.getISBN();
		if (isbn != null) {
			System.out.println("El ISBN del libro es: "+isbn);
		}
		
	}

}
