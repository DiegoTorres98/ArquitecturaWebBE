package pe.edu.mycamp.mycamp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.mycamp.mycamp.entities.Department;
import pe.edu.mycamp.mycamp.repositories.DepartmentRepository;

import java.util.List;

@Service
public class DepartmentServiceImpl {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public List<Department> list() {
        return departmentRepository.findAll();
    }
}
