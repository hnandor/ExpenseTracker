package com.nhuszka.expense_tracker.util;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import com.nhuszka.expense_tracker.util.DecimalFormatter;

public class DecimalFormatterTest {

	@Test
	public void testDecimalFormatter() {
		String act = DecimalFormatter.format(BigDecimal.ONE);
		assertEquals("1", act);
	}
}
