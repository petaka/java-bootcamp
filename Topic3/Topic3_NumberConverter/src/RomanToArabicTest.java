import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToArabicTest {

	@Test
	public void testRomanToArabic() {
		Number n = new Number("V");
		String number = n.getNumber();
		assertEquals(n.convert(number), 5);
	}

	@Test
	public void testRomanToArabic_II() {
		Number n = new Number("xix");
		String number = n.getNumber();
		assertEquals(n.convert(number), 19);
	}

	@Test
	public void testRomanToArabic_III() {
		Number n = new Number("xxxii");
		String number = n.getNumber();
		assertEquals(n.convert(number), 32);
	}

}
