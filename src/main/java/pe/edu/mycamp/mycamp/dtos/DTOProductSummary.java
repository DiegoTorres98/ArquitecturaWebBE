package pe.edu.mycamp.mycamp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DTOProductSummary {
    private Long id;
    private String department;
    private String name;
    private String products;
    private Double minimumKg;
    private Double amountKg;
    private String  reservation;
    private Double price;
    private String store;
    private Double total;
}
