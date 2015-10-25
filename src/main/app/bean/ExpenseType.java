package bean;

import java.math.BigDecimal;

import util.DecimalFormatter;

public class ExpenseType {
	private final String type;
	private final BigDecimal value;
	
	public ExpenseType(String type, BigDecimal value) {
		this.type = type;
		this.value = value;
	}

	public String getFormattedString() {
		return DecimalFormatter.format(value);
	}
	
	@Override
	public String toString() {
		return getFormattedString();
	}

}