package pe.edu.mycamp.mycamp.services;

import pe.edu.mycamp.mycamp.entities.Product;

import java.util.List;

public interface ProductService {
    public List<DTOProductSummary> list();
    public List<DTOProductSummary> listByNameAndDepartment(String name, String department);
    public List<DTOProductSummary> listByName(String name);
    public List<DTOProductSummary> listByDepartment(String department);
    public List<DTOProductSummary> listShoppingHistory();
    public List<DTOProductSummary> listReservationsHistory();
    public Product saveHistoryPurchase(Product product);
    public Product saveReservationsHistory(Product product);
}
