package manuelsenatore.ProjectW4.services;


import manuelsenatore.ProjectW4.entities.Citta;
import manuelsenatore.ProjectW4.entities.Postazione;
import manuelsenatore.ProjectW4.entities.User;
import manuelsenatore.ProjectW4.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	@Autowired
	UserRepository ur;

	public void addUser(User u) {
		ur.save(u);
	}

	public List<User> getAll() {
		return ur.findAll();
	}

	public User findUserById(Long id){
		return ur.findById(id).isPresent() ? ur.findById(id).get() : null;
	}


}
