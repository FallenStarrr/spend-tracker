package com.superapp.expense_tracker.service;


import com.superapp.expense_tracker.dto.ExpDto;
import com.superapp.expense_tracker.model.Expense;
import com.superapp.expense_tracker.repo.ExpenseRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseTrackerService implements IExpenseTrackerService {

    @Autowired
    private ExpenseRepo expenseRepo;


    @Override
    public Expense createExpense(ExpDto  exp) {
        Expense expense = new Expense();
        expense.setAmount(exp.getAmount());
        expense.setCategory(exp.getCategory());
        expenseRepo.save(expense);
        return expense;
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
