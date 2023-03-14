package sashko.servicesapp.bookly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sashko.servicesapp.bookly.model.Tenant;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Long> {
}
