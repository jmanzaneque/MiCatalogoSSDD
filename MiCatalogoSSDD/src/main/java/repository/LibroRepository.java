package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Editorial;
import model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
	public List<Libro> findByAutores(String autores);
	public List<Libro> findByOrderByAutoresAsc();
	public Libro findByTitulo(String titulo);
	public List<Libro> findByOrderByTituloAsc();
	public List<Libro> findByCategoria(String categoria);
	public List<Libro> findByOrderByCategoriaAsc();
	public List<Libro> findByNPaginas(int nPaginas);
	public List<Libro> findByOrderByNPaginasAsc();
	public List<Libro> findByPvp(float pvp);
	public List<Libro> findByOrderByPvpAsc();
	public List<Libro> findByAnyoPublicacion(int anyoPublicacion);
	public List<Libro> findByOrderByAnyoPublicacionAsc();
	public List<Libro> findByEditorial(Editorial editorial);
	public List<Libro> findByOrderByEditorialAsc();
	
}
