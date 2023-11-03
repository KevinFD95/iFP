package es.ifp.programacion.uf4.poo.ejemplos.ejercicio1.clases;

import java.util.Date;

public class Libro {
	
	//ATRIBUTOS
	
	private String titulo;
	private String autor;
	private String isbn;
	private String editorial;
	private String sinopsis;
	private Date fechaPubli;
	private float precio;
	
	//CONSTRUCTORES
	
	/**
	 * Constructor con todos los parametros/atributos
	 * @param titulo
	 * @param autor
	 * @param isbn
	 * @param editorial
	 * @param sinopsis
	 * @param fechaPubli
	 * @param precio
	 */
	public Libro (String titulo, String autor, String isbn, String editorial, String sinopsis, Date fechaPubli, float precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.editorial = editorial;
		this.sinopsis = sinopsis;
		this.fechaPubli = fechaPubli;
		this.precio = precio;
	}
	
	/**
	 * Constructor sin ISBN ni fecha de publicacion
	 * @param titulo
	 * @param autor
	 * @param editorial
	 * @param sinopsis
	 * @param precio
	 */
	public Libro (String titulo, String autor, String editorial, String sinopsis, float precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.sinopsis = sinopsis;
		this.precio = precio;
	}
	
	//METODOS

	/**
	 * Metodo get que retorna el titulo del libro
	 * @return un String con el titulo del libro
	 */
	public String getTitulo() {
		return this.titulo;
	}
	/**
	 * Metodo get que retorna el nombre del autor
	 * @return un String con el nombre del autor
	 */
	public String getAutor() {
		return this.autor;
	}
	/**
	 * Metodo get que retorna el ISBN del libro
	 * @return un String con el ISBN del libro
	 */
	public String getISBN() {
		return this.isbn;
	}
	/**
	 * Metodo get que retorna el nombre de la editorial del libro
	 * @return un String con el nombre de la editorial del libro
	 */
	public String getEditorial() {
		return this.editorial;
	}
	/**
	 * Metodo get que retorna la sinopsis del libro
	 * @return un String con la sinopsis del libro
	 */
	public String getSinopsis() {
		return this.sinopsis;
	}
	/**
	 * Metodo get que retorna la fecha de publicacion del libro
	 * @return una clase Date con la fecha de publicacion del libro
	 */
	public Date getFechaPubli() {
		return this.fechaPubli;
	}
	/**
	 * Metodo get que retorna el precio del libro
	 * @return un float con el precio del libro
	 */
	public float getPrecio() {
		return this.precio;
	}
	/**
	 * Metodo set que modifica el precio del libro
	 * @param nuevoPrecio valor de tipo float con el nuevo precio asignado al libro
	 */
	public void setPrecio(float nuevoPrecio) {
		this.precio = nuevoPrecio;
	}
}
