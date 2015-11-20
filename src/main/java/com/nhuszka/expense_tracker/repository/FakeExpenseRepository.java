package com.nhuszka.expense_tracker.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nhuszka.expense_tracker.bean.Expense;
import com.nhuszka.expense_tracker.bean.ExpenseBuilder;
import com.nhuszka.expense_tracker.bean.ExpenseType;

/**
 * Expenses on-the-fly without DB connection.
 */
@Repository
public class FakeExpenseRepository implements ExpenseRepository {

	@Autowired
	private FakeExpenseTypeRepository expenseTypeRepository;

	private static List<Expense> expenses;

	public List<Expense> listExpense() {
		return Optional.ofNullable(expenses).orElse(createFakeExpenses());
	}

	private List<Expense> createFakeExpenses() {
		expenses = new ArrayList<Expense>();
		expenseTypeRepository.listExpenseType().forEach((type) -> {
			expenses.add(buildFakeExpense(type));
		});
		return expenses;
	}

	private Expense buildFakeExpense(ExpenseType type) {
		return new ExpenseBuilder()
				.withType(type)
				.withAmount(getFakeAmount())
				.build();
	}

	private BigDecimal getFakeAmount() {
		return BigDecimal.ONE.add(new BigDecimal(expenses.size()));
	}

	public Expense addExpense(Expense expense) {
		expenses = listExpense();
		expenses.add(expense);
		return expense;
	}
}
