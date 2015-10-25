import repository.ExpenseTypeRepository;
import repository.FakeExpenseTypeRepository;

public class AppStart {
	public static void main(String[] args) {
		ExpenseTypeRepository beanRepository = new FakeExpenseTypeRepository();
		System.out.println(beanRepository.listExpenseTypes());
	}
}
