package manuelsenatore.ProjectW4.services;

import manuelsenatore.ProjectW4.entities.Citta;
import manuelsenatore.ProjectW4.entities.Postazione;
import manuelsenatore.ProjectW4.entities.Prenotazione;
import manuelsenatore.ProjectW4.entities.User;
import manuelsenatore.ProjectW4.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class PrenotazioneService {

    @Autowired
    PrenotazioneRepository pr;

    public List<Prenotazione> getAll() {
        return pr.findAll();
    }

    public Prenotazione findPrenotazioneById(Long id){
        return pr.findById(id).isPresent() ? pr.findById(id).get() : null;
    }

    public void realAddPrenotazione(User u, Postazione p, LocalDate d){
        Prenotazione prenotazione = Prenotazione.builder().user(u).data(d).postazione(p).build();
        List<Prenotazione> list = pr.findPrenotazioneByTipo(u,d,p);
        if (list.size()==0){
            pr.save(prenotazione);
        }else{
            System.out.println("Non puoi POJOOOO!");
        }
    }


}
