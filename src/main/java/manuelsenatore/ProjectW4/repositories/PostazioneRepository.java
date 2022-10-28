package manuelsenatore.ProjectW4.repositories;
import manuelsenatore.ProjectW4.entities.Citta;
import manuelsenatore.ProjectW4.entities.Postazione;
import manuelsenatore.ProjectW4.entities.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {

    @Query(
            value = "SELECT p FROM Postazione p WHERE p.tipo = :t AND p.edificio.citta = :c"
    )
    public List<Postazione> findPostazioneByTipoAndCitta( @Param( "t") Tipo t, @Param( "c" ) Citta c);
}
