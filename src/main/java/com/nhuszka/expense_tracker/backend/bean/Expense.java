package com.nhuszka.expense_tracker.backend.bean;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Expense other = (Expense) obj;
		if (amount == null) {
			if (other.amount != null) {
				return false;
			}
		} else if (!amount.equals(other.amount)) {
			return false;
		}
		if (type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!type.equals(other.type)) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return "Expense: " + type.getName() + ", " + amount;
	}
}
