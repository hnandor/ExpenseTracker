package bean;

public class ExpenseTypeBuilder {
	private String type;

	public ExpenseType build() {
		return new ExpenseType(type);
	}

	public ExpenseTypeBuilder withType(String type) {
		this.type = type;
		return this;
	}
}
