package com.nhuszka.expense_tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhuszka.expense_tracker.bean.Expense;
import com.nhuszka.expense_tracker.repository.ExpenseRepository;
import com.nhuszka.expense_tracker.repository.FakeExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepository;

	@Autowired
	public ExpenseService(FakeExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}

	public List<Expense> listExpense() {
		return expenseRepository.listExpense();
	}
	
	public Expense addExpense(Expense expense) {
		return expenseRepository.addExpense(expense);
	}
}
