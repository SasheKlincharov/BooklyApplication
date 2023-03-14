package sashko.servicesapp.bookly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sashko.servicesapp.bookly.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
