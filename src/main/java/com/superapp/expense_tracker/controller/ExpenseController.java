package com.superapp.expense_tracker.controller;


import com.superapp.expense_tracker.model.Expense;
import com.superapp.expense_tracker.service.IExpenseTrackerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ExpenseController {
    private  IExpenseTrackerService expenseService;


    @PostMapping("/expense")
    public Expense createExpense(@RequestBody Expense exp) {
        return expenseService.createExpense(exp);
    }


    @GetMapping("/expense")
    public List<Expense> getExpense() {
        return expenseService.getExpense();
    }


    @GetMapping("/expense/:category")
    public List<Expense> getExpenseByCategory(@PathVariable String category) {
        return expenseService.getByCategory(category);
    }

}
