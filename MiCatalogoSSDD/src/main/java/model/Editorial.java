package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Editorial {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idEditorial;
	
	private String nombre, email;
	private long telefono, cPostal, nif;
	
	@OneToMany(mappedBy = "editorial")
	private List<Libro> libros;
	
	public Editorial() {}
	
	public Editorial(String nombre,  long telefono, String email, long cPostal, long nif) {
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.cPostal = cPostal;
		this.nif = nif;
		this.libros = new ArrayList<Libro>();
		
	}

	public long getIdEditorial() {
		return idEditorial;
	}

	public void setIdEditorial(long idEditorial) {
		this.idEditorial = idEditorial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public long getcPostal() {
		return cPostal;
	}

	public void setcPostal(long cPostal) {
		this.cPostal = cPostal;
	}

	public long getNif() {
		return nif;
	}

	public void setNif(long nif) {
		this.nif = nif;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
}
