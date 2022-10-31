package manuelsenatore.ProjectW4.controllers;

import manuelsenatore.ProjectW4.entities.Citta;
import manuelsenatore.ProjectW4.entities.Edificio;
import manuelsenatore.ProjectW4.entities.Postazione;
import manuelsenatore.ProjectW4.entities.Tipo;
import manuelsenatore.ProjectW4.services.CittaService;
import manuelsenatore.ProjectW4.services.EdificioService;
import manuelsenatore.ProjectW4.services.PostazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;
import java.util.Optional;

@RestController
public class TestController {
    @Autowired
    PostazioneService ps;

    @Autowired
    CittaService cs;

    @Autowired
    EdificioService es;


    @GetMapping("api/postazione")
    public List<Postazione> getAllPostazione() {
       return ps.getAll();
    }

    @GetMapping("api/citta")
    public List<Citta> getAllCitta(){
        return cs.getAll();
    }

    @GetMapping("api/edificio")
    public List<Edificio> getAllEdificio(){
        return es.getAll();
    }
    
    @PostMapping("api/citta")
    public Citta postCitta(
            @RequestParam("name") String name
    ){
        Citta c = new Citta();
        c.setName(name);
        cs.addCitta(c);
        return c;
    }

    @PostMapping("api/postazione")
    public Postazione postPostazione(
            @RequestParam("description") String description,
            @RequestParam("maxSize") int maxSize,
            @RequestParam("tipo") Tipo tipo,
            @RequestParam(name = "edificio_id", required = false) Long edificio_id

    ){
        Postazione p = new Postazione();
        p.setDescription(description);
        p.setMaxSize(maxSize);
        p.setTipo(tipo);
        Optional<Edificio> e = Optional.ofNullable(es.findEdificioById(edificio_id));
        e.ifPresent(p::setEdificio);
        ps.addPostazione(p);
        return p;
    }


}
