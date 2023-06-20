package pe.edu.mycamp.mycamp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 150)
    private String name;
    @Column(nullable = false, length = 9)
    private String phone;
    @Column(nullable = false, length = 8)
    private String dni;
    @Column(nullable = false, length = 50)
    private String department;
    @Column(nullable = false, length = 50)
    private String district;
    @Column(nullable = false, length = 50)
    private String address;
    @Column(nullable = false, length = 100)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String birthday;
    @Column(nullable = false, length = 50)
    private String sex;
}
