package sashko.servicesapp.bookly.service;

import sashko.servicesapp.bookly.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProduct(Long productId);
}
