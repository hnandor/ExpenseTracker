package com.nhuszka.expense_tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nhuszka.expense_tracker.service.ExpenseService;
import com.nhuszka.expense_tracker.service.ExpenseTypeService;

@Component(ExpenseTracker.EXPENSE_TRACKER_ID)
public class ExpenseTracker {

	public final static String EXPENSE_TRACKER_ID = "expenseTrackerApp";

	private final ExpenseTypeService expenseTypeService;
	private final ExpenseService expenseService;

	@Autowired
	public ExpenseTracker(ExpenseTypeService expenseTypeService, ExpenseService expenseService) {
		this.expenseTypeService = expenseTypeService;
		this.expenseService = expenseService;
	}

	public void start() {
		System.out.println("SUCCESS: " + expenseTypeService.listExpenseType());
		System.out.println("SUCCESS: " + expenseService.listExpense());
	}
}