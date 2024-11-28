package com.superapp.expense_tracker.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;


@Entity
@Table(name = "expense")
@Data
public class Expense {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private String category;

}
