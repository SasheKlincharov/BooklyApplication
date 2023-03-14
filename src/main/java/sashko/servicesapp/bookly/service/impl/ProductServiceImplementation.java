package sashko.servicesapp.bookly.service.impl;

import org.springframework.stereotype.Service;
import sashko.servicesapp.bookly.exceptions.EntityNotFoundException;
import sashko.servicesapp.bookly.model.Product;
import sashko.servicesapp.bookly.repository.ProductRepository;
import sashko.servicesapp.bookly.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImplementation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new EntityNotFoundException(Product.class, productId));
    }
}
