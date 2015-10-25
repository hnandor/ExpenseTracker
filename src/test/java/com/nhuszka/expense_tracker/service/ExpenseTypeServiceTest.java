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
		ExpenseTypeService service = new ExpenseTypeService(expenseTypeRepository);
		assertNotNull(service);
	}

	@Test
	public void test02_ExpenseTypeServiceUsesTheProperRepository() {
		final List<ExpenseType> aList = new ArrayList();
		aList.add(new ExpenseTypeBuilder().withType("sf").build());
		when(expenseTypeRepository.listExpenseTypes()).thenReturn(aList);
		
		List<ExpenseType> listExpenseTypes = 
				new ExpenseTypeService(expenseTypeRepository).listExpenseTypes();

		assertEquals(aList, listExpenseTypes);	
	}
}
