import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToArabicTest {

	@Test
	public void testRomanToArabic() {
		Number n = new Number("i");
		String number = n.getNumber();
		assertEquals(n.convert(number), 1);
	}

	@Test
	public void testRomanToArabic_II() {
		Number n = new Number("ii");
		String number = n.getNumber();
		assertEquals(n.convert(number), 2);
	}
	
	@Test
	public void testRomanToArabic_III() {
		Number n = new Number("iv");
		String number = n.getNumber();
		assertEquals(n.convert(number), 4);
	}
	@Test
	public void testRomanToArabic_IV() {
		Number n = new Number("XV");
		String number = n.getNumber();
		assertEquals(n.convert(number), 15);
	}
	@Test
	public void testRomanToArabic_V() {
		Number n = new Number("CM");
		String number = n.getNumber();
		assertEquals(n.convert(number), 900);
	}
	@Test
	public void testRomanToArabic_VI() {
		Number n = new Number("CDX");
		String number = n.getNumber();
		assertEquals(n.convert(number), 410);
	}
	@Test
	public void testRomanToArabic_VII() {
		Number n = new Number("CCLV");
		String number = n.getNumber();
		assertEquals(n.convert(number), 255);
	}
	@Test
	public void testRomanToArabic_VIII() {
		Number n = new Number("CXLIX");
		String number = n.getNumber();
		assertEquals(n.convert(number), 149);
	}
	@Test
	public void testRomanToArabic_IX() {
		Number n = new Number("CLXix");
		String number = n.getNumber();
		assertEquals(n.convert(number), 169);
	}
	@Test
	public void testRomanToArabic_X() {
		Number n = new Number("|IV");
		String number = n.getNumber();
		assertEquals(n.convert(number), 4000);
	}
	@Test
	public void testRomanToArabic_XI() {
		Number n = new Number("|IVDXXI");
		String number = n.getNumber();
		assertEquals(n.convert(number), 4521);
	}
	@Test
	public void testRomanToArabic_XII() {
		Number n = new Number("|VIIIDCXX");
		String number = n.getNumber();
		assertEquals(n.convert(number), 8620);
	}
}
