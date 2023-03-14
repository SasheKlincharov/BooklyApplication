package sashko.servicesapp.bookly.service.impl;

import org.springframework.stereotype.Service;
import sashko.servicesapp.bookly.exceptions.EntityNotFoundException;
import sashko.servicesapp.bookly.model.Category;
import sashko.servicesapp.bookly.repository.CategoryRepository;
import sashko.servicesapp.bookly.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImplementation implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImplementation(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategory(Long categoryId) {
        return categoryRepository.findById(categoryId)
                .orElseThrow(() -> new EntityNotFoundException(Category.class, categoryId));
    }
}
