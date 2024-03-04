package eam.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import eam.app.model.Hotel;


@Repository
public interface repositoryHotel extends JpaRepository<Hotel, Long>{

}
