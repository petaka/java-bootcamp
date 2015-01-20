public class Number {

	String number;

	public Number(String number) {
		this.number = number;
	}

	public String getNumber() {
		// TODO Auto-generated method stub
		return number;
	}

	public int convert(String number) {
		return this.getUnidades(number);
	}

	public int getUnidades(String number) {
		String roman = number.toUpperCase().trim();
		switch (roman) {
		case "I": {
			return 1;
		}
		case "II": {
			return 2;
		}
		case "III": {
			return 3;
		}
		case "IV": {
			return 4;
		}
		case "V": {
			return 5;
		}
		case "VI": {
			return 6;
		}
		case "VII": {
			return 7;
		}
		case "VIII": {
			return 8;
		}
		case "IX": {
			return 9;
		}
		case "X": {
			return 10;
		}
		case "XI": {
			return 11;
		}
		case "XII": {
			return 12;
		}
		case "XIII": {
			return 13;
		}
		case "XIV": {
			return 14;
		}
		case "XV": {
			return 15;
		}
		case "XVI": {
			return 16;
		}
		case "XVII": {
			return 17;
		}
		case "XVIII": {
			return 18;
		}
		case "XIX": {
			return 19;
		}

		}
		return 0;
	}

	public int getDecenas(String number) {
		String roman = number.toUpperCase().trim();
		switch (roman) {
		case "XX": {
			return 20;
		}
		case "XXX": {
			return 30;
		}
		case "XL": {
			return 40;
		}
		case "L": {
			return 50;
		}
		case "LX": {
			return 60;
		}
		case "LXX": {
			return 70;
		}
		case "LXXX": {
			return 80;
		}
		case "LXL": {
			return 90;
		}
		}
		return 0;
	}
}
