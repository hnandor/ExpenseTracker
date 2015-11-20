package com.nhuszka.expense_tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhuszka.expense_tracker.bean.ExpenseType;
import com.nhuszka.expense_tracker.bean.ExpenseTypeBuilder;
import com.nhuszka.expense_tracker.repository.ExpenseTypeRepository;

@Service
class ExpenseTypeService<R extends ExpenseTypeRepository> {

	private final ExpenseTypeRepository expenseTypeRepository;

	@Autowired
	ExpenseTypeService(R expenseTypeRepository) {
		this.expenseTypeRepository = expenseTypeRepository;
	}

	List<ExpenseType> listExpenseType() {
		return expenseTypeRepository.listExpenseType();
	}

	ExpenseType addExpenseType(ExpenseTypeBuilder expenseTypeBuilder) {
		ExpenseType type = expenseTypeBuilder.build();
		return expenseTypeRepository.addExpenseType(type);
	}
}
