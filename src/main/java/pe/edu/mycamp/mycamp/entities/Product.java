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
    @Column(nullable = false, columnDefinition = "DOUBLE DEFAULT 0")
    private Double total;
    @Column(nullable = false, columnDefinition = "VARCHAR(255) DEFAULT 'product'")
    private String type;
}
