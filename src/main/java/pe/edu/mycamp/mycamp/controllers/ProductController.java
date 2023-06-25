package pe.edu.mycamp.mycamp.controllers;

import org.apache.commons.lang3.StringUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.mycamp.mycamp.dtos.DTOProductSummary;
import pe.edu.mycamp.mycamp.entities.Product;
import pe.edu.mycamp.mycamp.services.ProductService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/products")
    public ResponseEntity<List<DTOProductSummary>> getProducts(@RequestParam(value="name", required = false) String name, @RequestParam(value="department", required = false) String department){
        List<DTOProductSummary> products = productService.list();
        if(StringUtils.isNotBlank(name) && StringUtils.isNotBlank(department)){
            products = productService.listByNameAndDepartment(name, department);
        } else if (StringUtils.isNotBlank(name)){
            products = productService.listByName(name);
        } else if (StringUtils.isNotBlank(department)){
            products = productService.listByDepartment(department);
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
    @GetMapping("/history_sales")
    public ResponseEntity<List<DTOProductSummary>> getShoppingHistory(){
        List<DTOProductSummary> departments = productService.listShoppingHistory();
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }
    @GetMapping("/history_reservations")
    public ResponseEntity<List<DTOProductSummary>> getReservationsHistory(){
        List<DTOProductSummary> departments = productService.listReservationsHistory();
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }
    @PostMapping("/history_sales")
    public ResponseEntity<DTOProductSummary> addHistoryPurchaseProduct(@RequestBody DTOProductSummary product){
        ModelMapper m = new ModelMapper();
        Product newProduct = m.map(product, Product.class);
        Product addProduct = productService.saveHistoryPurchase(newProduct);
        return new ResponseEntity<>(m.map(addProduct, DTOProductSummary.class), HttpStatus.CREATED);
    }
    @PostMapping("/history_reservations")
    public ResponseEntity<DTOProductSummary> addReserveProduct(@RequestBody DTOProductSummary product){
        ModelMapper m = new ModelMapper();
        Product newProduct = m.map(product, Product.class);
        Product addProduct = productService.saveReservationsHistory(newProduct);
        return new ResponseEntity<>(m.map(addProduct, DTOProductSummary.class), HttpStatus.CREATED);
    }
}
