package com.nhuszka.expense_tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nhuszka.expense_tracker.bean.Expense;
import com.nhuszka.expense_tracker.bean.ExpenseBuilder;
import com.nhuszka.expense_tracker.bean.ExpenseType;
import com.nhuszka.expense_tracker.bean.ExpenseTypeBuilder;
import com.nhuszka.expense_tracker.repository.FakeExpenseRepository;
import com.nhuszka.expense_tracker.repository.FakeExpenseTypeRepository;

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
