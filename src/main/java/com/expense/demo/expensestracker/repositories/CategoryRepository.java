package com.expense.demo.expensestracker.repositories;


import com.expense.demo.expensestracker.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

    Category findById(int id);
}
