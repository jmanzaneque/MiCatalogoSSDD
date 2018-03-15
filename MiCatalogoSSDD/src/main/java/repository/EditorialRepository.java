package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Editorial;

public interface EditorialRepository extends JpaRepository <Editorial, Long> {
	Editorial findByNombre(String nombre);
	List<Editorial> findAllByOrderByNombreAsc();
	Editorial findByEmail(String email);
	List<Editorial> findAllByOrderByEmailAsc();
	Editorial findByTelefono(long telefono);
	List<Editorial> findAllByOrderByTelefonoAsc();
	List<Editorial> findByCPostal(long cPostal);
	List<Editorial> findAllByOrderByCPostalAsc();
	Editorial findByNif(long nif);
	List<Editorial> findAllByOrderByNifAsc();
}
