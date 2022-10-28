package manuelsenatore.ProjectW4;

import manuelsenatore.ProjectW4.entities.*;
import manuelsenatore.ProjectW4.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ProjectW4Application implements CommandLineRunner {

	@Autowired
	UserService us;
	@Autowired
	CittaService cs;
	@Autowired
	EdificioService es;
	@Autowired
	PostazioneService ps;
	@Autowired
	PrenotazioneService prs;

	public static void main(String[] args) {
		SpringApplication.run(ProjectW4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//insertUser(User.builder().username("gigi33").nomeCompleto("Gigi Basta").email("gigino@gmail").build());
		//insertCitta(Citta.builder().name("Toronto").build());
		//insertEdificio(Edificio.builder().name("Palazzo verde").address("Via vegas").citta(cs.findCittaById(1L)).build());
		//insertPostazione(Postazione.builder().tipo(Tipo.PRIVATO).maxSize(10).description("lavoro").edificio(es.findEdificioById(1L)).build());
		//System.out.println(ps.getByTipoAndCitta(Tipo.PRIVATO, cs.findCittaById(1L)));
		//insertPrenotazione(us.findUserById(1L),ps.findPostazioneById(2L),LocalDate.now());
	}

	public void insertUser(User u){
		us.addUser(u);
	}
	public void insertCitta(Citta c){
		cs.addCitta(c);
	}
	public void insertEdificio(Edificio e){
		es.addEdificio(e);
	}
	public void insertPostazione(Postazione p){
		ps.addPostazione(p);
	}
	public void insertPrenotazione(User u, Postazione p, LocalDate d){
		prs.realAddPrenotazione(u,p,d);
	}



}
