import static org.junit.Assert.*;

import org.junit.Test;

public class DoubleToString {

	@Test
	public void convert_1_to_one() {

		// Numero number = new Numero(1);
		assertEquals(new Numero().getDecenas(1), "one");
	}

	@Test
	public void convert_2_to_two() {

		// Numero number = new Numero(1);
		assertEquals(new Numero().getDecenas(2), "two");
	}

	@Test
	public void test_integer_Full() {
		Numero number = new Numero(35);
		assertEquals(number.getDecenas(number.getNumber()), "thirty five");
	}

	@Test
	// enteros entre 100 y 999
	public void test_integerII() {
		Numero number = new Numero(455);
		assertEquals(number.convert(number.getNumber()), "four hundred fifty five");
	}

	@Test
	// enteros entre 1000 y 9999
	public void test_integerIII() {
		Numero number = new Numero(1500);
		assertEquals(number.convert(number.getNumber()), "one thousand five hundred ");
	}

	@Test
	// obtener centavos
	public void test_cents() {
		Numero number = new Numero(0.07);
		assertEquals(number.getCents(number.getNumber()), "and 0.07/100 cents");
	}
}
