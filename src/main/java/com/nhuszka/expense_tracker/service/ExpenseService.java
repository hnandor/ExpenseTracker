package com.nhuszka.expense_tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhuszka.expense_tracker.bean.Expense;
import com.nhuszka.expense_tracker.bean.ExpenseBuilder;
import com.nhuszka.expense_tracker.repository.ExpenseRepository;

@Service
class ExpenseService<R extends ExpenseRepository> {

	private final ExpenseRepository expenseRepository;

	@Autowired
	ExpenseService(R expenseRepository) {
		this.expenseRepository = expenseRepository;
	}

	List<Expense> listExpense() {
		return expenseRepository.listExpense();
	}

	Expense addExpense(ExpenseBuilder expenseBuilder) {
		Expense expense = expenseBuilder.build();
		return expenseRepository.addExpense(expense);
	}
}
