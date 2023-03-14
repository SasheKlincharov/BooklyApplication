package sashko.servicesapp.bookly.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sashko.servicesapp.bookly.model.Tenant;
import sashko.servicesapp.bookly.service.TenantService;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {
    private final TenantService tenantService;

    public HomeController(TenantService tenantService) {
        this.tenantService = tenantService;
    }

    @GetMapping
    public String getHomePage(Model model) {
        List<Tenant> tenants = tenantService.getAllTenants();
        model.addAttribute("tenants", tenants);
        return "home";
    }
}
