package sashko.servicesapp.bookly.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sashko.servicesapp.bookly.model.Product;
import sashko.servicesapp.bookly.service.ProductService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String getProductPage(@RequestParam(required = false) String error,
                                 @RequestParam(required = false) String searchByCategory,
                                 Model model) {
        addErrorIfPresent(model, error);
        List<Product> products;
        if (searchByCategory == null) {
            products = productService.getAllProducts();
        } else {
//            products = productService.filterProductsByCategory(searchByCategory);
            products = new ArrayList<>();
        }

        model.addAttribute("products", products);
        model.addAttribute("mainContent", "products");
        return "master-template";
    }

    private void addErrorIfPresent(Model model, String error) {
        if (error != null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
    }
}
