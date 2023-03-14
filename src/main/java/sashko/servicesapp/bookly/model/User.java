package sashko.servicesapp.bookly.model;

import lombok.Data;
import sashko.servicesapp.bookly.model.enums.Role;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userName;

    private String firstName;

    private String lastName;

    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Appointment> appointments;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    public User() {
    }
}
