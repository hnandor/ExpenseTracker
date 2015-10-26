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
		return Optional.ofNullable(expenseTypes).orElse(createExpenseTypes());
	}

	private List<ExpenseType> createExpenseTypes() {
		expenseTypes = new ArrayList<ExpenseType>();
		Arrays.asList(FakeType.values()).forEach((type) -> {
			expenseTypes.add(createExpenseType(type));
		});
		return expenseTypes;
	}

	private ExpenseType createExpenseType(final FakeType fakeType) {
		return new ExpenseTypeBuilder()
				.withType(PREFIX + fakeType.name())
				.build();
	}
}
