package util;

import java.math.BigDecimal;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DecimalFormatterTest {

	@Test
	public void testDecimalFormatter() {
		String act = DecimalFormatter.format(BigDecimal.ONE);
		assertEquals("1", act);
	}
}
