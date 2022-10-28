package manuelsenatore.ProjectW4.repositories;

import manuelsenatore.ProjectW4.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
