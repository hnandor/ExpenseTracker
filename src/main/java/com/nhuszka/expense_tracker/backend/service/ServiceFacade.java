package com.nhuszka.expense_tracker.backend.service;

import java.util.List;

import com.nhuszka.expense_tracker.backend.bean.Expense;
import com.nhuszka.expense_tracker.backend.bean.ExpenseBuilder;
import com.nhuszka.expense_tracker.backend.bean.ExpenseType;
import com.nhuszka.expense_tracker.backend.bean.ExpenseTypeBuilder;

public interface ServiceFacade {

	List<Expense> listExpense();

	Expense addExpense(ExpenseBuilder expenseBuilder);

	List<ExpenseType> listExpenseType();

	ExpenseType addExpenseType(ExpenseTypeBuilder expenseTypeBuilder);
}
