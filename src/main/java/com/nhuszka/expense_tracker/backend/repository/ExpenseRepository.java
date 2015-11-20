package com.nhuszka.expense_tracker.backend.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nhuszka.expense_tracker.backend.bean.Expense;

@Repository
public interface ExpenseRepository {

	List<Expense> listExpense();

	Expense addExpense(Expense expense);
}