package manuelsenatore.ProjectW4.services;

import manuelsenatore.ProjectW4.entities.Citta;
import manuelsenatore.ProjectW4.entities.Postazione;
import manuelsenatore.ProjectW4.entities.Prenotazione;
import manuelsenatore.ProjectW4.entities.Tipo;
import manuelsenatore.ProjectW4.repositories.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostazioneService {

    @Autowired
    PostazioneRepository prr;

    public void addPostazione(Postazione p) {
        prr.save(p);
    }

    public List<Postazione> getAll() {
        return prr.findAll();
    }

    public Postazione findPostazioneById(Long id){
        return prr.findById(id).isPresent() ? prr.findById(id).get() : null;
    }

    public List<Postazione> getByTipoAndCitta(Tipo tipo, Citta citta){return prr.findPostazioneByTipoAndCitta(tipo, citta);}
}
