package bean;

public class ExpenseType {
	private final String type;

	public ExpenseType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return type;
	}
}