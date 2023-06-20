package pe.edu.mycamp.mycamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.mycamp.mycamp.entities.Department;

public interface DepartmentRepository  extends JpaRepository<Department, Long> {
}
