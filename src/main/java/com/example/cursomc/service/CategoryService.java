package com.example.cursomc.service;

import com.example.cursomc.domain.Category;
import com.example.cursomc.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public Category findById(Integer id) {
        Optional<Category> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
