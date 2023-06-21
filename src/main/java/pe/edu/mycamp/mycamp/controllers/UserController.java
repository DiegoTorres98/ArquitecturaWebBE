package pe.edu.mycamp.mycamp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.mycamp.mycamp.entities.User;
import pe.edu.mycamp.mycamp.services.UserService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers(@RequestParam(value="email") String email, @RequestParam(value="password") String password){
        List<User> users = userService.listEmailPassword(email, password);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    @PostMapping("/users")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User newUser = userService.save(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

}
