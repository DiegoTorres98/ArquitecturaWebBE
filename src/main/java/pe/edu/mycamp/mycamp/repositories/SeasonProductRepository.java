package pe.edu.mycamp.mycamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.mycamp.mycamp.entities.SeasonProduct;

public interface SeasonProductRepository extends JpaRepository<SeasonProduct, Long> {
}
