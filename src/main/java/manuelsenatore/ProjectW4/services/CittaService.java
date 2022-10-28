package manuelsenatore.ProjectW4.services;

import manuelsenatore.ProjectW4.entities.Citta;
import manuelsenatore.ProjectW4.repositories.CittaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CittaService {

        @Autowired
        CittaRepository cr;

        public void addCitta(Citta c) {
            cr.save(c);
        }

        public List<Citta> getAll() {
        return cr.findAll();
        }

        public Citta findCittaById(Long id){
            return cr.findById(id).isPresent() ? cr.findById(id).get() : null;
        }
}

