package com.nhuszka.expense_tracker.bean;

public class ExpenseType {
	private final String name;

	public ExpenseType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ExpenseType: " + name;
	}
}