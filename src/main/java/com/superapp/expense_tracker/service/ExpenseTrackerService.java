package com.superapp.expense_tracker.service;


import com.superapp.expense_tracker.model.Expense;
import com.superapp.expense_tracker.repo.ExpenseRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExpenseTrackerService implements IExpenseTrackerService {
    private ExpenseRepo expenseRepo;


    @Override
    public Expense createExpense(Expense exp) {
        expenseRepo.save(exp);
        return exp;
    }


    @Override
    public List<Expense> getExpense() {
        return expenseRepo.findAll();
    }


    @Override
    public List<Expense> getByCategory(String category) {
        return expenseRepo.findAllByCategory(category);
    }
}
