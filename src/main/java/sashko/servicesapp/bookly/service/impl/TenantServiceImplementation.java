package sashko.servicesapp.bookly.service.impl;

import org.springframework.stereotype.Service;
import sashko.servicesapp.bookly.exceptions.EntityNotFoundException;
import sashko.servicesapp.bookly.model.Tenant;
import sashko.servicesapp.bookly.repository.TenantRepository;
import sashko.servicesapp.bookly.service.TenantService;

import java.util.List;

@Service
public class TenantServiceImplementation implements TenantService {

    private final TenantRepository tenantRepository;

    public TenantServiceImplementation(TenantRepository tenantRepository) {
        this.tenantRepository = tenantRepository;
    }

    @Override
    public List<Tenant> getAllTenants() {
        return tenantRepository.findAll();
    }

    @Override
    public Tenant getTenant(Long tenantId) throws EntityNotFoundException {
        return tenantRepository.findById(tenantId)
                .orElseThrow(() -> new EntityNotFoundException(Tenant.class, tenantId));
    }
}
