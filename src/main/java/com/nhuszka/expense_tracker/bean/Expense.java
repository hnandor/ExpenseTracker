package com.nhuszka.expense_tracker.bean;

import java.math.BigDecimal;

public class Expense {
	private final ExpenseType type;
	private final BigDecimal amount;
	
	Expense(ExpenseType type, BigDecimal amount) {
		this.type = type;
		this.amount = amount;
	}
	
	public ExpenseType getType() {
		return type;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Expense: " + type.getName() + ", " + amount;
	}
}
