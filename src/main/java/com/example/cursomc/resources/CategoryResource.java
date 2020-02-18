package com.example.cursomc.resources;

import com.example.cursomc.domain.Category;
import com.example.cursomc.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryResource {

    private final CategoryService service;

    public CategoryResource(CategoryService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById (@PathVariable Integer id) {

        Category obj = service.findById(id);

        return ResponseEntity.ok().body(obj);
    }
}
