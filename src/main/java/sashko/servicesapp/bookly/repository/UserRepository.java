package sashko.servicesapp.bookly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sashko.servicesapp.bookly.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
