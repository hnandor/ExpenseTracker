package com.nhuszka.expense_tracker.backend.bean;

import java.math.BigDecimal;

public class ExpenseBuilder {
	private ExpenseType type;
	private BigDecimal amount;

	public Expense build() {
		return new Expense(type, amount);
	}

	public ExpenseBuilder withType(ExpenseType type) {
		this.type = type;
		return this;
	}

	public ExpenseBuilder withAmount(BigDecimal amount) {
		this.amount = amount;
		return this;
	}
}
