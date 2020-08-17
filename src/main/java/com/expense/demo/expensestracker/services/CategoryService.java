package com.expense.demo.expensestracker.services;

import com.expense.demo.expensestracker.model.Category;
import com.expense.demo.expensestracker.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }


    public Category getCategoryById(int id){
       return categoryRepository.findById(id);
    }

    public Category addCategory(Category category){
        Category category1= categoryRepository.save(category);
        return  category1;
    }

    public void deleteById(int id){
        categoryRepository.deleteById(id);
        System.out.println("Deleted the category with" + " :" + id);
    }



}
