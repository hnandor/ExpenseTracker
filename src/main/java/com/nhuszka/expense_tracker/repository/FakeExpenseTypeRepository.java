package com.nhuszka.expense_tracker.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.nhuszka.expense_tracker.bean.ExpenseType;
import com.nhuszka.expense_tracker.bean.ExpenseTypeBuilder;

/**
 * Expense Types on-the-fly without DB connection.
 */
@Repository
public class FakeExpenseTypeRepository implements ExpenseTypeRepository {

	private static final String PREFIX = "FakeType";
	private static List<ExpenseType> expenseTypes;

	enum FakeType {
		ONE, TWO, THREE
	}

	public List<ExpenseType> listExpenseType() {
		return Optional.ofNullable(expenseTypes).orElse(createFakeExpenseTypes());
	}

	private List<ExpenseType> createFakeExpenseTypes() {
		expenseTypes = new ArrayList<ExpenseType>();
		Arrays.asList(FakeType.values()).forEach((type) -> {
			expenseTypes.add(createFakeExpenseType(type));
		});
		return expenseTypes;
	}

	private ExpenseType createFakeExpenseType(final FakeType fakeType) {
		return createExpenseType(PREFIX + fakeType.name());
	}

	private ExpenseType createExpenseType(String type) {
		return new ExpenseTypeBuilder()
				.withType(type)
				.build();
	}

	public ExpenseType addExpenseType(ExpenseType expenseType) {
		expenseTypes = listExpenseType();
		expenseTypes.add(expenseType);
		return expenseType;
	}
}
