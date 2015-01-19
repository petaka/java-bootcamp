public class Numero {

	private double number;

	public Numero(double number) {
		this.number = number;
		// TODO Auto-generated constructor stub
	}

	public Numero() {
		// TODO Auto-generated constructor stub
	}

	public String getUnidades(double number) {
		String num = "zero";

		switch ((int) number) {
		case 1: {
			return "one";
		}
		case 2: {
			return "two";
		}
		case 3: {
			return "three";
		}
		case 4: {
			return "four";
		}
		case 5: {
			return "five";
		}
		case 6: {
			return "six";
		}
		case 7: {
			return "seven";
		}
		case 8: {
			return "eight";
		}
		case 9: {
			return "nine";
		}
		case 10: {
			return "ten";
		}
		case 11: {
			return "eleven";
		}
		case 12: {
			return "twelve";
		}
		case 13: {
			return "thirteen";
		}
		case 14: {
			return "fourteen";
		}
		case 15: {
			return "fifteen";
		}
		case 16: {
			return "sixteen";
		}
		case 17: {
			return "seventeen";
		}
		case 18: {
			return "eighteen";
		}
		case 19: {
			return "nineteen";
		}
		case 20: {
			return "twenty";
		}

		}

		return num;
	}

	public String getDecenas(double number) {

		int decena = (int) number / 10;
		String num = "";
		double resto = number % 10;

		switch (decena) {

		case 2: {
			num = "twenty ";
			break;
		}
		case 3: {
			num = "thirty ";
			break;
		}
		case 4: {
			num = "forty ";
			break;
		}
		case 5: {
			num = "fifty ";
			break;
		}
		case 6: {
			num = "sixty ";
			break;
		}
		case 7: {
			num = "seventy ";
			break;
		}
		case 8: {
			num = "eighty ";
			break;
		}
		case 9: {
			num = "ninety ";
			break;
		}
		}

		if (resto != 0) {
			num += this.getUnidades(resto);
		}

		return num;

	}

	public String getCentenas(double number) {

		int centenas = (int) number / 100;
		String num = "";
		double resto = number % 100;

		switch (centenas) {
		case 1: {
			num = "one hundred ";
			break;
		}
		case 2: {
			num = "two hundred ";
			break;
		}
		case 3: {
			num = "three hundred ";
			break;
		}
		case 4: {
			num = "four hundred ";
			break;
		}
		case 5: {
			num = "five hundred ";
			break;
		}
		case 6: {
			num = "six hundred ";
			break;
		}
		case 7: {
			num = "seven hundred ";
			break;
		}
		case 8: {
			num = "eight hundred ";
			break;
		}
		case 9: {
			num = "nine hundred ";
			break;
		}
		}

		if (resto != 0) {
			num += this.getDecenas(resto);
		}

		return num;
	}

	public String getThousands(double number) {

		String num = "";
		int thousand = (int) number / 1000;
		double resto = number % 1000;

		switch (thousand) {
		case 1: {
			num = "one thousand ";
			break;
		}
		case 2: {
			num = "two thousand ";
			break;
		}
		case 3: {
			num = "three thousand ";
			break;
		}
		case 4: {
			num = "four thousand ";
			break;
		}
		case 5: {
			num = "five thousand ";
			break;
		}
		case 6: {
			num = "six thousand ";
			break;
		}
		case 7: {
			num = "seven thousand ";
			break;
		}
		case 8: {
			num = "eight thousand ";
			break;
		}
		case 9: {
			num = "nine thousand ";
			break;
		}
		}

		if (resto != 0) {
			num += this.getCentenas(resto);
		}

		return num;
	}

	public String convert(double number) {

		if (number <= 19) {
			return this.getUnidades(number);
		}
		if ((number >= 20) && (number < 99)) {
			return this.getDecenas(number);
		}
		if ((number >= 100) && (number < 999)) {

			return this.getCentenas(number);
		}

		return this.getThousands(number);
	}

	public String getCents(double number) {

		return "and " + number + "/100 cents";

	}

	public double getNumber() {
		// TODO Auto-generated method stub
		return number;
	}

}
