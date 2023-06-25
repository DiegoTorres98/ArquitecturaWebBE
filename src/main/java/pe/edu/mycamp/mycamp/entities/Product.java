package pe.edu.mycamp.mycamp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String department;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String products;
    @Column(nullable = false)
    private Double minimumKg;
    @Column(nullable = false)
    private Double amountKg;
    @Column(nullable = false)
    private String  reservation;
    @Column(nullable = false)
    private Double price;
    @Column(nullable = false)
    private String store;
    @Column(nullable = false)
    private Double total;
    @Column(nullable = false)
    private String type;

    public Product(String department, String name, String products, Double minimumKg, Double amountKg, String reservation, Double price, String store, Double total, String type) {
        this.department = department;
        this.name = name;
        this.products = products;
        this.minimumKg = minimumKg;
        this.amountKg = amountKg;
        this.reservation = reservation;
        this.price = price;
        this.store = store;
        this.total = total;
        this.type = type;
    }
}
