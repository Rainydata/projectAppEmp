package eam.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import eam.app.model.Employee;


@Repository
public interface repositoryEmployee extends JpaRepository<Employee, Long>{

}
