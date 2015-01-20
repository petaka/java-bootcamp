public class RomanNumber { // Coverts an Int number to Roman

	int number;

	public RomanNumber(int number) {

		this.number = number;
	}

	public int getNumber() {
		// TODO Auto-generated method stub
		return this.number;
	}

	public String convert(int number) {

		if ((number > 0) && (number < 11)) {
			return this.getUnidad(number);
		}
		if ((number >= 11) && (number <= 19)) {
			int unidad = (number - 10);
			return "X" + this.getUnidad(unidad);
		}

		if ((number > 19) && (number <= 99)) {
			int unidad = (number % 10);
			String resUnidades;
			if (unidad == 9) {
				resUnidades = "IX";
			} else {
				resUnidades = this.getUnidad(unidad);
			}
			return this.getDecenas(number) + resUnidades;
		}

		if ((number > 99) && (number <= 999)) {
			int dec = (int) (number % 100);
			int unidad = (dec % 10);

			String resUnidades;
			if (unidad == 9) {
				resUnidades = "IX";
			} else {
				resUnidades = this.getUnidad(unidad);
			}
			return this.getCentenas(number) + this.getDecenas(dec) + resUnidades;
		}
		if ((number > 999) && (number <= 9999)) {
			int cen = (int) (number % 1000);
			int dec = (int) (cen % 100);
			int unidad = (dec % 10);
			String resUnidades;
			if (unidad == 9) {
				resUnidades = "IX";
			} else {
				resUnidades = this.getUnidad(unidad);
			}
			return this.getMiles(number) + this.getCentenas(cen) + this.getDecenas(dec) + resUnidades;
		}
		return "El numero no se puede convertir";
	}

	public String getUnidad(int number) {
		String result = "";

		switch (number) {
		case 1: {
			result = "I";
			break;
		}
		case 2: {
			result = "II";
			break;
		}
		case 3: {
			result = "III";
			break;
		}
		case 4: {
			result = "IV";
			break;
		}
		case 5: {
			result = "V";
			break;
		}
		case 6: {
			result = "VI";
			break;
		}
		case 7: {
			result = "VII";
			break;
		}
		case 8: {
			result = "VIII";
			break;
		}
		case 9: {
			result = "IX";
		}
		case 10: {
			result = "X";
		}

		}
		return result;

	}

	public String getDecenas(int number) {
		int dec = (int) (number) / 10;
		switch (dec) {

		case 2: {
			return "XX";
		}
		case 3: {
			return "XXX";
		}
		case 4: {
			return "XL";
		}
		case 5: {
			return "L";
		}
		case 6: {
			return "LX";
		}
		case 7: {
			return "LXX";
		}
		case 8: {
			return "LXXX";
		}
		case 9: {
			return "XC";
		}
		}
		return "";
	}

	public String getCentenas(int number) {
		int cen = (int) (number) / 100;
		switch (cen) {
		case 1: {
			return "C";
		}
		case 2: {
			return "CC";
		}
		case 3: {
			return "CCC";
		}
		case 4: {
			return "CD";
		}
		case 5: {
			return "D";
		}
		case 6: {
			return "DC";
		}
		case 7: {
			return "DCC";
		}
		case 8: {
			return "DCCC";
		}
		case 9: {
			return "CM";
		}
		}
		return "";
	}

	public String getMiles(int number) {
		int mil = (int) (number) / 1000;
		switch (mil) {
		case 1: {
			return "M";
		}
		case 2: {
			return "MM";
		}
		case 3: {
			return "MMM";
		}
		case 4: {
			return "|IV ";
		}
		case 5: {
			return "|V ";
		}
		case 6: {
			return "|VI ";
		}
		case 7: {
			return "|VII ";
		}
		case 8: {
			return "|VIII ";
		}
		case 9: {
			return "|IX ";
		}
		}
		return "";
	}
}
