package co.edu.ufps.repositories;

import co.edu.ufps.entities.Taller; // Cambiar por la entidad correspondiente
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TallerRepository extends JpaRepository<Taller, Integer> {
}
