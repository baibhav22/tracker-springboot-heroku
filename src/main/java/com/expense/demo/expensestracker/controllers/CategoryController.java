package com.expense.demo.expensestracker.controllers;

import com.expense.demo.expensestracker.model.Category;
import com.expense.demo.expensestracker.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/allcategories")
    public List<Category> getallcategories(){
        return categoryService.getAllCategories();
    }

    @GetMapping("/category/{id}")
    public Category getCategoryById(@PathVariable int id){

        Category cat=  categoryService.getCategoryById(id);
        return cat;

    }

    @PostMapping("/postcategory")
     ResponseEntity<Category> postcategories(@RequestBody Category category) throws URISyntaxException {
        Category result= categoryService.addCategory(category);
        return ResponseEntity.created(new URI("/api/postcategory" + result.getId())).body(result);

    }


    @PutMapping("/putcategory")
    ResponseEntity<Category> putcategories(@RequestBody Category category){
        categoryService.addCategory(category);

      return ResponseEntity.ok().build();
    }

    @DeleteMapping("/category/{id}")
    public ResponseEntity<?> deleteCategories(int id){
      categoryService.deleteById(id);
      return ResponseEntity.ok().build();
    }
}
