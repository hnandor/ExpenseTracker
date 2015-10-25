package com.nhuszka.expense_tracker;

import com.nhuszka.expense_tracker.repository.ExpenseTypeRepository;
import com.nhuszka.expense_tracker.repository.FakeExpenseTypeRepository;

public class AppStart {
	public static void main(String[] args) {
		ExpenseTypeRepository beanRepository = new FakeExpenseTypeRepository();
		System.out.println(beanRepository.listExpenseTypes());
	}
}
