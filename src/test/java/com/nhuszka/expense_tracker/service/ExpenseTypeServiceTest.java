package com.nhuszka.expense_tracker.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.nhuszka.expense_tracker.bean.ExpenseType;
import com.nhuszka.expense_tracker.bean.ExpenseTypeBuilder;
import com.nhuszka.expense_tracker.repository.FakeExpenseRepository;
import com.nhuszka.expense_tracker.repository.FakeExpenseTypeRepository;

public class ExpenseTypeServiceTest {

	private FakeExpenseTypeRepository expenseTypeRepository;

	@Before
	public void initBeforeTest() {
		expenseTypeRepository = mock(FakeExpenseTypeRepository.class);
	}

	@Test
	public void test01_ExpenseTypeServiceIsSuccessfullyMocked() {
		ExpenseTypeService service = getExpenseTypeService();
		assertNotNull(service);
	}

	private ExpenseTypeService getExpenseTypeService() {
		return new ExpenseTypeService(expenseTypeRepository, mock(FakeExpenseRepository.class));
	}

	@Test
	public void test02_ExpenseTypeServiceUsesTheProperRepository() {
		final List<ExpenseType> aList = givenExpenseTypeRepositoryReturnsWithTypeList();

		List<ExpenseType> listExpenseTypes = getExpenseTypeService().listExpenseType();

		assertEquals(aList, listExpenseTypes);
	}

	private List<ExpenseType> givenExpenseTypeRepositoryReturnsWithTypeList() {
		final List<ExpenseType> aList = new ArrayList<ExpenseType>();
		aList.add(new ExpenseTypeBuilder().withType("testType").build());
		when(expenseTypeRepository.listExpenseType()).thenReturn(aList);
		return aList;
	}
}
