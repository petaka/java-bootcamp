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
		number = number.toUpperCase().trim();
		if (number.length() != 0){
			

			if (number.startsWith("|IX")){
				number = number.substring(3);
				return 9000 + this.convert(number);
			}
			if (number.startsWith("|VIII")){
				number = number.substring(5);
				return 8000 + this.convert(number);
			}
			if (number.startsWith("|XII")){
				number = number.substring(3);
				return 7000 + this.convert(number);
			}
			if (number.startsWith("|VI")){
				number = number.substring(3);
				return 6000 + this.convert(number);
			}
			if (number.startsWith("|V")){
				number = number.substring(2);
				return 5000 + this.convert(number);
			}
			if (number.startsWith("|IV")){
				number = number.substring(3);
				return 4000 + this.convert(number);
			}

			if (number.startsWith("M")){
				number = number.substring(1);
				return 1000 + this.convert(number);
			}

			if (number.startsWith("CM")){
				number = number.substring(2);
				return 900 + this.convert(number);
			}
			if (number.startsWith("D")) {
				number = number.substring(1);
				return 500 + convert(number);
			}
			if (number.startsWith("CD")) {
				number = number.substring(2);
				return 400 + convert(number);
			}
			if (number.startsWith("C")) {
				number = number.substring(1);
				return 100 + convert(number);
			}
			if (number.startsWith("XC")) {
				number = number.substring(2);
				return 90 + convert(number);
			}
			if (number.startsWith("L")) {
				number = number.substring(1);
				return 50 + convert(number);
			}
			if (number.startsWith("XL")) {
				number = number.substring(2);
				return 40 + convert(number);
			}
			if (number.startsWith("X")){
				number=number.substring(1);
				return 10 + this.convert(number);
			}
			if (number.startsWith("IX")){
				number=number.substring(2);
				return 9 + this.convert(number);
			}
			if (number.startsWith("V")){
				number=number.substring(1);
				return 5 + this.convert(number);
			}
			if (number.startsWith("IV")){
				number=number.substring(2);
				return 4 + this.convert(number);
			}
			
			
			if (number.startsWith("I")){
				number=number.substring(1);
				return 1 + this.convert(number);
			}
		}
		return 0;
	}
	
}
