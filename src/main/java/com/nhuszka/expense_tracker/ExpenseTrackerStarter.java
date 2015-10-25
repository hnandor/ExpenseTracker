package com.nhuszka.expense_tracker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nhuszka.expense_tracker.repository.ExpenseTypeRepository;
import com.nhuszka.expense_tracker.repository.FakeExpenseTypeRepository;
import com.nhuszka.expense_tracker.service.ExpenseTypeService;

public class ExpenseTrackerStarter {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-config.xml");
		
		ExpenseTracker expenseTracker = (ExpenseTracker) context.getBean(ExpenseTracker.EXPENSE_TRACKER_ID);
		expenseTracker.start();
	}
}
