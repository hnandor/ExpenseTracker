package com.nhuszka.expense_tracker.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class DecimalFormatter {

	public static final DecimalFormat format = new DecimalFormat();
	
	public static String format(BigDecimal value) {
		return format.format(value);
	}
}
