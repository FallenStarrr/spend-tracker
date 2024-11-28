package com.superapp.expense_tracker.controller;


import com.superapp.expense_tracker.dto.ExpDto;
import com.superapp.expense_tracker.model.Expense;
import com.superapp.expense_tracker.service.IExpenseTrackerService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseController {

    @Autowired
    private  IExpenseTrackerService expenseService;


    @PostMapping("/expense")
    public Expense createExpense(@RequestBody ExpDto exp) {
        return expenseService.createExpense(exp);
    }


    @GetMapping("/expense")
    public List<Expense> getExpense() {
        return expenseService.getExpense();
    }


    @GetMapping("/expense/{category}")
    public List<Expense> getExpenseByCategory(@PathVariable("category") String category) {
        return expenseService.getByCategory(category);
    }

}
