package manuelsenatore.ProjectW4.repositories;

import manuelsenatore.ProjectW4.entities.Citta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CittaRepository extends JpaRepository<Citta, Long> {

}
