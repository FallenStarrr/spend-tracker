package com.superapp.expense_tracker.dto;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Data
public class ExpDto {
    private double amount;
    private String category;


    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ExpDto{" +
                "amount=" + amount +
                ", category='" + category + '\'' +
                '}';
    }



    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }
}
