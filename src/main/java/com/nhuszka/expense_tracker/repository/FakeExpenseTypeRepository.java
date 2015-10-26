package com.nhuszka.expense_tracker.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nhuszka.expense_tracker.bean.ExpenseType;
import com.nhuszka.expense_tracker.bean.ExpenseTypeBuilder;

/**
 * Expense Types on-the-fly without DB connection.
 */
@Repository
public class FakeExpenseTypeRepository implements ExpenseTypeRepository {

	private static final String PREFIX = "FakeType";

	private enum FakeType {
		ONE, TWO, THREE
	}

	private ExpenseType createExpenseType(final FakeType fakeType) {
		return new ExpenseTypeBuilder().withType(PREFIX + fakeType.name()).build();
	}

	public List<ExpenseType> listExpenseType() {
		List<ExpenseType> fakeTypes = new ArrayList<ExpenseType>();
		for (FakeType type : FakeType.values()) {
			fakeTypes.add(createExpenseType(type));
		}
		return fakeTypes;
	}
}
