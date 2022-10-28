package manuelsenatore.ProjectW4.repositories;

import manuelsenatore.ProjectW4.entities.Postazione;
import manuelsenatore.ProjectW4.entities.Prenotazione;
import manuelsenatore.ProjectW4.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {

    @Query(
            value = "SELECT p FROM Prenotazione p WHERE (p.user = :u AND p.data = :d) OR (p.postazione = :p AND " +
                    "p.data= :d)"
    )
    public List<Prenotazione> findPrenotazioneByTipo( @Param( "u" ) User u, @Param( "d" ) LocalDate d,
                                                      @Param( "p" ) Postazione p);
}
