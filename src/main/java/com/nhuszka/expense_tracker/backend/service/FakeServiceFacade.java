package com.nhuszka.expense_tracker.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nhuszka.expense_tracker.backend.bean.Expense;
import com.nhuszka.expense_tracker.backend.bean.ExpenseBuilder;
import com.nhuszka.expense_tracker.backend.bean.ExpenseType;
import com.nhuszka.expense_tracker.backend.bean.ExpenseTypeBuilder;
import com.nhuszka.expense_tracker.backend.repository.FakeExpenseRepository;
import com.nhuszka.expense_tracker.backend.repository.FakeExpenseTypeRepository;

/**
 * Service access, stubbed
 */
@Component
public class FakeServiceFacade implements ServiceFacade {

	@Autowired
	private ExpenseService<FakeExpenseRepository> expenseService;

	@Autowired
	private ExpenseTypeService<FakeExpenseTypeRepository> expenseTypeService;

	@Override
	public List<Expense> listExpense() {
		return expenseService.listExpense();
	}

	@Override
	public Expense addExpense(ExpenseBuilder expenseBuilder) {
		return expenseService.addExpense(expenseBuilder);
	}

	@Override
	public List<ExpenseType> listExpenseType() {
		return expenseTypeService.listExpenseType();
	}

	@Override
	public ExpenseType addExpenseType(ExpenseTypeBuilder expenseTypeBuilder) {
		return expenseTypeService.addExpenseType(expenseTypeBuilder);
	}
}
