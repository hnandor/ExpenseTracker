package com.nhuszka.expense_tracker.service;

import java.util.List;

import com.nhuszka.expense_tracker.bean.Expense;
import com.nhuszka.expense_tracker.bean.ExpenseType;

public interface ServiceFacade {

	List<Expense> listExpense();

	List<ExpenseType> listExpenseType();
}
