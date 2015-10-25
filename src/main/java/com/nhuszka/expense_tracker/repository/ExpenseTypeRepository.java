package com.nhuszka.expense_tracker.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nhuszka.expense_tracker.bean.ExpenseType;

@Repository
public abstract class ExpenseTypeRepository {

	public abstract List<ExpenseType> listExpenseTypes();
}
