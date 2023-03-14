package sashko.servicesapp.bookly.service;

import sashko.servicesapp.bookly.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories();

    Category getCategory(Long categoryId);
}
