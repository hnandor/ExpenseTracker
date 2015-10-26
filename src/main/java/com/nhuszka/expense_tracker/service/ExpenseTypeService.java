package com.nhuszka.expense_tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhuszka.expense_tracker.bean.ExpenseType;
import com.nhuszka.expense_tracker.repository.ExpenseRepository;
import com.nhuszka.expense_tracker.repository.ExpenseTypeRepository;
import com.nhuszka.expense_tracker.repository.FakeExpenseRepository;
import com.nhuszka.expense_tracker.repository.FakeExpenseTypeRepository;

@Service
public class ExpenseTypeService {

	private final ExpenseTypeRepository expenseTypeRepository;
	private final ExpenseRepository expenseRepository;

	@Autowired
	public ExpenseTypeService(FakeExpenseTypeRepository expenseTypeRepository, FakeExpenseRepository expenseRepository) {
		this.expenseTypeRepository = expenseTypeRepository;
		this.expenseRepository = expenseRepository;
	}

	public List<ExpenseType> listExpenseType() {
		return expenseTypeRepository.listExpenseType();
	}
	
	public List<ExpenseType> listExpense() {
		return expenseTypeRepository.listExpenseType();
	}
}
