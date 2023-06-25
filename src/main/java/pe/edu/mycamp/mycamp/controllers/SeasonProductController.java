package pe.edu.mycamp.mycamp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.mycamp.mycamp.entities.Department;
import pe.edu.mycamp.mycamp.entities.SeasonProduct;
import pe.edu.mycamp.mycamp.services.SeasonProductService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class SeasonProductController {
    @Autowired
    private SeasonProductService seasonProductService;
    @GetMapping("/season_products")
    public ResponseEntity<List<SeasonProduct>> getSeasonProducts(){
        List<SeasonProduct> seasonProducts = seasonProductService.list();
        return new ResponseEntity<>(seasonProducts, HttpStatus.OK);
    }
}
