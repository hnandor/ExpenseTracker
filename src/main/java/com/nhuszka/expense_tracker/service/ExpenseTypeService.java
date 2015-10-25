package com.nhuszka.expense_tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhuszka.expense_tracker.bean.ExpenseType;
import com.nhuszka.expense_tracker.repository.ExpenseTypeRepository;
import com.nhuszka.expense_tracker.repository.FakeExpenseTypeRepository;

@Service
public class ExpenseTypeService {

	private final ExpenseTypeRepository expenseTypeRepository;

	@Autowired
	public ExpenseTypeService(FakeExpenseTypeRepository expenseTypeRepository) {
		this.expenseTypeRepository = expenseTypeRepository;
	}

	public List<ExpenseType> listExpenseTypes() {
		return expenseTypeRepository.listExpenseTypes();
	}
}
