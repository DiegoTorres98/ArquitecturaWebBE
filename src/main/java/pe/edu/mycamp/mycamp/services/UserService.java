package pe.edu.mycamp.mycamp.services;

import pe.edu.mycamp.mycamp.entities.User;

import java.util.List;

public interface UserService {
    public User save(User user);
    public List<User> listEmailPassword(String email, String password);
}
