package com.nhuszka.expense_tracker.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nhuszka.expense_tracker.bean.Expense;

/**
 * Expenses on-the-fly without DB connection.
 */
@Repository
public class FakeExpenseRepository implements ExpenseRepository {

	public List<Expense> listExpense() {
		throw new UnsupportedOperationException();
	}

}
