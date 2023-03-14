package sashko.servicesapp.bookly.model;

import lombok.Data;
import sashko.servicesapp.bookly.model.enums.CategoryType;

import javax.persistence.*;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long Id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private CategoryType categoryType;

    public Category() {
    }
}
