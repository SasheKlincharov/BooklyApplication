package sashko.servicesapp.bookly.model;

import lombok.Data;
import sashko.servicesapp.bookly.model.enums.ProductType;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    private String name;

    private double price;

    private String imageUrl;

    @Enumerated(value = EnumType.STRING)
    private ProductType productType;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Tenant> tenants;

    public Product() {
    }
}
