package pe.edu.mycamp.mycamp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.mycamp.mycamp.entities.User;
import pe.edu.mycamp.mycamp.repositories.UserRepository;
import pe.edu.mycamp.mycamp.services.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> listEmailPassword(String email, String password) {
        return userRepository.findAllByEmailAndPassword(email, password);
    }

}
