package com.nhuszka.expense_tracker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExpenseTrackerStarter {

	private static final String APP_CONFIG_FILE_PATH = "spring/application-config.xml";

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(APP_CONFIG_FILE_PATH);

		ExpenseTracker expenseTracker = (ExpenseTracker) context.getBean(ExpenseTracker.EXPENSE_TRACKER_ID);
		expenseTracker.start();
	}
}
