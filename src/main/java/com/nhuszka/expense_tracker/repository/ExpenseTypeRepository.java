package com.nhuszka.expense_tracker.repository;

import java.util.List;

import com.nhuszka.expense_tracker.bean.ExpenseType;

public abstract class ExpenseTypeRepository {

	public abstract List<ExpenseType> listExpenseTypes();
}
