package pe.edu.mycamp.mycamp.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.mycamp.mycamp.entities.Product;
import pe.edu.mycamp.mycamp.repositories.ProductRepository;
import pe.edu.mycamp.mycamp.services.ProductService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    private List<DTOProductSummary> productToDTO(List<Product> products){
        ModelMapper m = new ModelMapper();
        return products.stream().map(x-> m.map(x, DTOProductSummary.class)
        ).collect(Collectors.toList());
    }

    @Override
    public List<DTOProductSummary> list() {
        return productToDTO(productRepository.listByType("product"));
    }

    @Override
    public List<DTOProductSummary> listByNameAndDepartment(String name, String department) {
        return productToDTO(productRepository.listByNameAndDepartment(name, department));
    }

    @Override
    public List<DTOProductSummary> listByName(String name) {
        return productToDTO(productRepository.findAllByName(name));
    }

    @Override
    public List<DTOProductSummary> listByDepartment(String department) {
        return productToDTO(productRepository.findAllByDepartment(department));
    }

    @Override
    public List<DTOProductSummary> listShoppingHistory() {
        return productToDTO(productRepository.listByType("sales"));
    }

    @Override
    public List<DTOProductSummary> listReservationsHistory() {
        return productToDTO(productRepository.listByType("reservations"));
    }

    @Override
    public Product saveHistoryPurchase(Product product) {
        product.setType("sales");
        return productRepository.save(product);
    }

    @Override
    public Product saveReservationsHistory(Product product) {
        product.setType("reservations");
        return productRepository.save(product);
    }
}
