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
import com.nhuszka.expense_tracker.repository.FakeExpenseTypeRepository;

public class ExpenseTypeServiceTest {

	private FakeExpenseTypeRepository expenseTypeRepository;

	@Before
	public void initBeforeTest() {
		expenseTypeRepository = mock(FakeExpenseTypeRepository.class);
	}

	@Test
	public void test01_ExpenseTypeServiceIsSuccessfullyMocked() {
		ExpenseTypeService<FakeExpenseTypeRepository> service = getExpenseTypeService();
		assertNotNull(service);
	}

	private ExpenseTypeService<FakeExpenseTypeRepository> getExpenseTypeService() {
		return new ExpenseTypeService<FakeExpenseTypeRepository>(expenseTypeRepository);
	}

	@Test
	public void test02_ExpenseTypeServiceUsesTheProperRepository() {
		final List<ExpenseType> expenseTypeList = createExpenseTypeList();

		when(expenseTypeRepository.listExpenseType()).thenReturn(expenseTypeList);

		assertEquals(expenseTypeList, getExpenseTypeService().listExpenseType());
	}

	private List<ExpenseType> createExpenseTypeList() {
		final List<ExpenseType> expenseTypeList = new ArrayList<ExpenseType>();
		expenseTypeList.add(createExpenseType());
		return expenseTypeList;
	}

	private ExpenseType createExpenseType() {
		return new ExpenseTypeBuilder()
				.withType("testType")
				.build();
	}
}
