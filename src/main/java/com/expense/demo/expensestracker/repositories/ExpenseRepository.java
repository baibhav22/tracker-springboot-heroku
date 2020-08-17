package com.expense.demo.expensestracker.repositories;

import com.expense.demo.expensestracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ExpenseRepository extends JpaRepository<Expense,Integer> {
}
