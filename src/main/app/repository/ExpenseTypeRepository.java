package repository;

import java.util.List;

import bean.ExpenseType;

public abstract class ExpenseTypeRepository {

	public abstract List<ExpenseType> listExpenseTypes();
}
