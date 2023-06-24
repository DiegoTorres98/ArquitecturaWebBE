package pe.edu.mycamp.mycamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.mycamp.mycamp.entities.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT p FROM Product p WHERE p.name LIKE :name AND p.department LIKE :department")
    public List<Product> listByNameAndDepartment(String name, String department);
    public List<Product> findAllByName(String name);
    public List<Product> findAllByDepartment(String department);
    @Query("SELECT p FROM Product p WHERE p.type=:type")
    public List<Product> listByType(String type);

}
