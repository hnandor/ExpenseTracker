package service;

import java.util.List;

import bean.ExpenseType;
import repository.FakeExpenseTypeRepository;

public class ExpenseTypeService {

	public List<ExpenseType> listExpenseTypes() {
		return new FakeExpenseTypeRepository().listExpenseTypes();
	}
}
