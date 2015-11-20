package com.nhuszka.expense_tracker.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nhuszka.expense_tracker.bean.Expense;

@Repository
public interface ExpenseRepository {

	List<Expense> listExpense();

	Expense addExpense(Expense expense);
}