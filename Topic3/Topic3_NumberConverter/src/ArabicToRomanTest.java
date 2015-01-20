import static org.junit.Assert.*;

import org.junit.Test;

public class ArabicToRomanTest {

	@Test
	public void testArabicToRoman() {
		RomanNumber rn = new RomanNumber(1);
		int number = rn.getNumber();
		assertEquals(rn.convert(number), "I");
	}

	@Test
	public void testArabicToRoman_II() {
		RomanNumber rn = new RomanNumber(15);
		int number = rn.getNumber();
		assertEquals(rn.convert(number), "XV");
	}

	@Test
	public void testArabicToRoman_III() {
		RomanNumber rn = new RomanNumber(10);
		int number = rn.getNumber();
		assertEquals(rn.convert(number), "X");
	}

	@Test
	public void testArabicToRoman_IV() {
		RomanNumber rn = new RomanNumber(78);
		int number = rn.getNumber();
		assertEquals(rn.convert(number), "LXXVIII");
	}

	@Test
	public void testArabicToRoman_V() {
		RomanNumber rn = new RomanNumber(99);
		int number = rn.getNumber();
		assertEquals(rn.convert(number), "XCIX");
	}

	@Test
	public void testArabicToRoman_VI() {
		RomanNumber rn = new RomanNumber(155);
		int number = rn.getNumber();
		assertEquals(rn.convert(number), "CLV");
	}

	@Test
	public void testArabicToRoman_VII() {
		RomanNumber rn = new RomanNumber(659);
		int number = rn.getNumber();
		assertEquals(rn.convert(number), "DCLIX");
	}

	@Test
	public void testArabicToRoman_VIII() {
		RomanNumber rn = new RomanNumber(999);
		int number = rn.getNumber();
		assertEquals(rn.convert(number), "CMXCIX");
	}

	@Test
	public void testArabicToRoman_IX() {
		RomanNumber rn = new RomanNumber(1999);
		int number = rn.getNumber();
		assertEquals(rn.convert(number), "MCMXCIX");
	}

}
