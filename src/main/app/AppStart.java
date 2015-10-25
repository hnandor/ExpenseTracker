import java.math.BigDecimal;

import bean.ExpenseType;

public class AppStart {
	public static void main(String[] args) {
		System.out.println(new ExpenseType("a", BigDecimal.TEN));
		System.out.println("Success");
	}
}
