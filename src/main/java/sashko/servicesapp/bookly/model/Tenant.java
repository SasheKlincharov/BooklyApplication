package sashko.servicesapp.bookly.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Map;
import java.util.Set;

@Data
@Entity
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    @ManyToOne
    private User owner;

    @Embedded
    private ContactInfo contactInfo;

    private double rating;

    private LocalTime startWorkHour;

    private LocalTime endWorkHour;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "tenant", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Appointment> appointments;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Product> products;

    private Map<Category, Set<Product>> productsByCategory;

    public Tenant() {
    }
}
