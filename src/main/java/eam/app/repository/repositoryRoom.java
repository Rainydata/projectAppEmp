package eam.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import eam.app.model.Room;


@Repository
public interface repositoryRoom extends JpaRepository<Room, Long>{

}
