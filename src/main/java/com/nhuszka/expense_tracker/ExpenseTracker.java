package com.nhuszka.expense_tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nhuszka.expense_tracker.service.FakeServiceFacade;
import com.nhuszka.expense_tracker.service.ServiceFacade;

@Component(ExpenseTracker.EXPENSE_TRACKER_ID)
public class ExpenseTracker {

	public final static String EXPENSE_TRACKER_ID = "expenseTrackerApp";

	private final ServiceFacade serviceFacade;

	@Autowired
	public ExpenseTracker(FakeServiceFacade fakeServiceFacade) {
		this.serviceFacade = fakeServiceFacade;
	}

	public void start() {
		System.out.println("SUCCESS: " + serviceFacade.listExpenseType());
		System.out.println("SUCCESS: " + serviceFacade.listExpense());
	}
}