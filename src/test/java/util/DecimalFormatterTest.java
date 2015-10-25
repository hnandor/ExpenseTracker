package util;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class DecimalFormatterTest {

	@Test
	public void testDecimalFormatter() {
		String act = DecimalFormatter.format(BigDecimal.ONE);
		assertEquals("1", act);
	}
}
