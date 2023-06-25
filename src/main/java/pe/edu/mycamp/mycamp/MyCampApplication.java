package pe.edu.mycamp.mycamp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pe.edu.mycamp.mycamp.entities.Department;
import pe.edu.mycamp.mycamp.entities.Product;
import pe.edu.mycamp.mycamp.entities.SeasonProduct;
import pe.edu.mycamp.mycamp.repositories.DepartmentRepository;
import pe.edu.mycamp.mycamp.repositories.ProductRepository;
import pe.edu.mycamp.mycamp.repositories.SeasonProductRepository;
import pe.edu.mycamp.mycamp.services.DepartmentService;
import pe.edu.mycamp.mycamp.services.ProductService;
import pe.edu.mycamp.mycamp.services.SeasonProductService;

@SpringBootApplication
public class MyCampApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCampApplication.class, args);
    }

    @Bean
    public CommandLineRunner mappingDemo(
            DepartmentRepository departmentRepository,
            ProductRepository productRepository,
            SeasonProductRepository seasonProductRepository
    ) {
        return args -> {
            departmentRepository.save(new Department("Lima"));
            departmentRepository.save(new Department("Arequipa"));
            departmentRepository.save(new Department("Cusco"));
            departmentRepository.save(new Department("Puno"));
            departmentRepository.save(new Department("Tacna"));
            departmentRepository.save(new Department("Moquegua"));
            departmentRepository.save(new Department("Ica"));
            departmentRepository.save(new Department("Loreto"));
            departmentRepository.save(new Department("Madre de Dios"));
            departmentRepository.save(new Department( "Ucayali"));
            departmentRepository.save(new Department( "San Martin"));
            departmentRepository.save(new Department( "Amazonas"));
            departmentRepository.save(new Department( "Ancash"));
            departmentRepository.save(new Department( "La Libertad"));
            departmentRepository.save(new Department( "Lambayeque"));
            departmentRepository.save(new Department( "Piura"));
            departmentRepository.save(new Department( "Tumbes"));
            departmentRepository.save(new Department( "Cajamarca"));
            departmentRepository.save(new Department( "Ayacucho"));
            departmentRepository.save(new Department( "Apurimac"));
            departmentRepository.save(new Department( "Huancavelica"));
            departmentRepository.save(new Department( "Junin"));
            departmentRepository.save(new Department( "Pasco"));
            departmentRepository.save(new Department( "Huánuco"));
            departmentRepository.save(new Department( "Callao"));
            productRepository.save(new Product("Lima", "Manzana Chilena", "Manzana, Naranja, Platano", 30.0, 0.0, "", 5.50, "Lala Store", 0.0, "product"));
            productRepository.save(new Product("Ica", "Platano Isla", "Platano, Lechuga, Tomate", 20.0, 0.0, "", 2.50, "Lucho Tienda", 0.0, "product"));
            productRepository.save(new Product("Amazonas", "Lechuga Fresca", "Lechuga, Camote, Papa", 30.0, 0.0, "", 4.0, "Tienda Don Pepe", 0.0, "product"));
            productRepository.save(new Product("Lambayeque", "Lechuga Fresca", "Lechuga, Mandarina, Zapallo", 10.0, 0.0, "", 3.50, "Peter Store", 0.0, "product"));
            seasonProductRepository.save(new SeasonProduct("Manzanas", "Manzana"));
            seasonProductRepository.save(new SeasonProduct("Platanos", "Platano"));
            seasonProductRepository.save(new SeasonProduct("Lechugas", "Lechuga"));
        };
    }
}
