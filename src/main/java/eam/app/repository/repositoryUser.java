package eam.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import eam.app.model.User;


@Repository
public interface repositoryUser extends JpaRepository<User, Long>{
	User findByUsernameAndPassword(String username,String password);
}
