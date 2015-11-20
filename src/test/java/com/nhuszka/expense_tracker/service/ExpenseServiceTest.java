package com.nhuszka.expense_tracker.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.nhuszka.expense_tracker.bean.Expense;
import com.nhuszka.expense_tracker.bean.ExpenseBuilder;
import com.nhuszka.expense_tracker.bean.ExpenseType;
import com.nhuszka.expense_tracker.repository.FakeExpenseRepository;

public class ExpenseServiceTest {

	private FakeExpenseRepository expenseRepository;
	private ExpenseService<FakeExpenseRepository> expenseService;

	@Before
	public void initBeforeTest() {
		expenseRepository = mock(FakeExpenseRepository.class);
		expenseService = new ExpenseService<FakeExpenseRepository>(expenseRepository);
	}

	@Test
	public void test01_ExpenseServiceListExpense() {
		final List<Expense> expenseList = givenAnExpenseList();

		assertEquals(expenseList, expenseService.listExpense());
	}

	private List<Expense> givenAnExpenseList() {
		final List<Expense> expenseList = createExpenseList();
		when(expenseRepository.listExpense()).thenReturn(expenseList);
		return expenseList;
	}

	private List<Expense> createExpenseList() {
		final List<Expense> expenseList = new ArrayList<Expense>();
		expenseList.add(createExpense());
		return expenseList;
	}

	private Expense createExpense() {
		return new ExpenseBuilder()
				.withType(mock(ExpenseType.class))
				.withAmount(mock(BigDecimal.class))
				.build();
	}
}
