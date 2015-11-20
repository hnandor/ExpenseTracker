package com.nhuszka.expense_tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nhuszka.expense_tracker.backend.service.FakeServiceFacade;
import com.nhuszka.expense_tracker.backend.service.ServiceFacade;
import com.nhuszka.expense_tracker.gui.ExpenseTrackerGUI;

@Component(ExpenseTracker.EXPENSE_TRACKER_ID)
public class ExpenseTracker {

	public final static String EXPENSE_TRACKER_ID = "expenseTrackerApp";

	private final ExpenseTrackerGUI gui;
	private final ServiceFacade serviceFacade;

	@Autowired
	public ExpenseTracker(ExpenseTrackerGUI gui, FakeServiceFacade fakeServiceFacade) {
		this.gui = gui;
		this.serviceFacade = fakeServiceFacade;
	}

	public void start() {
		gui.start(serviceFacade);
	}
}