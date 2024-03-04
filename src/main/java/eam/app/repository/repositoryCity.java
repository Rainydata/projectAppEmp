package eam.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import eam.app.model.City;


@Repository
public interface repositoryCity extends JpaRepository<City, Long>{

}
