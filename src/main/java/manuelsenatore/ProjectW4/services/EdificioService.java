package manuelsenatore.ProjectW4.services;

import manuelsenatore.ProjectW4.entities.Citta;
import manuelsenatore.ProjectW4.entities.Edificio;
import manuelsenatore.ProjectW4.entities.Postazione;
import manuelsenatore.ProjectW4.repositories.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EdificioService {
    @Autowired
    EdificioRepository er;

    public void addEdificio(Edificio e){
        er.save(e);
    }

    public List<Edificio> getAll() {
        return er.findAll();
    }

    public Edificio findEdificioById(Long id){
        return er.findById(id).isPresent() ? er.findById(id).get() : null;
    }
}
