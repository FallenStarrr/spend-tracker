package com.superapp.expense_tracker.service;

import com.superapp.expense_tracker.dto.ExpDto;
import com.superapp.expense_tracker.model.Expense;

import java.util.List;

public interface IExpenseTrackerService {
    Expense createExpense(ExpDto exp);
    List<Expense> getExpense();
    List<Expense> getByCategory(String category);
}
