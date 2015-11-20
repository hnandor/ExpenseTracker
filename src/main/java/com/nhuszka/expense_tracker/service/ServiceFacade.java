package com.nhuszka.expense_tracker.service;

import java.util.List;

import com.nhuszka.expense_tracker.bean.Expense;
import com.nhuszka.expense_tracker.bean.ExpenseBuilder;
import com.nhuszka.expense_tracker.bean.ExpenseType;
import com.nhuszka.expense_tracker.bean.ExpenseTypeBuilder;

public interface ServiceFacade {

	List<Expense> listExpense();

	Expense addExpense(ExpenseBuilder expenseBuilder);

	List<ExpenseType> listExpenseType();

	ExpenseType addExpenseType(ExpenseTypeBuilder expenseTypeBuilder);
}
