package sashko.servicesapp.bookly.service;

import sashko.servicesapp.bookly.model.Tenant;

import java.util.List;

public interface TenantService {

    List<Tenant> getAllTenants();

    Tenant getTenant(Long tenantId);
}
