package sashko.servicesapp.bookly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sashko.servicesapp.bookly.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
