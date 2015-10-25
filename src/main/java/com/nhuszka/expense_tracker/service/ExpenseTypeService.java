package com.nhuszka.expense_tracker.service;

import java.util.List;

import com.nhuszka.expense_tracker.bean.ExpenseType;
import com.nhuszka.expense_tracker.repository.FakeExpenseTypeRepository;

public class ExpenseTypeService {

	public List<ExpenseType> listExpenseTypes() {
		return new FakeExpenseTypeRepository().listExpenseTypes();
	}
}
