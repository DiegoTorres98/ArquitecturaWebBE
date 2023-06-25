package pe.edu.mycamp.mycamp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.mycamp.mycamp.entities.SeasonProduct;
import pe.edu.mycamp.mycamp.repositories.SeasonProductRepository;
import pe.edu.mycamp.mycamp.services.SeasonProductService;

import java.util.List;

@Service
public class SeasonProductServiceImpl implements SeasonProductService {
    @Autowired
    private SeasonProductRepository seasonProductRepository;
    @Override
    public List<SeasonProduct> list() {
        return seasonProductRepository.findAll();
    }
}
