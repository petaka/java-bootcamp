import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static Numero number;

	public static void main(String[] args) {

		while (true) {
			System.out.println("Ingrese numero");
			double input = sc.nextDouble();

			number = new Numero(input);
			int entero = (int) input;
			double dec = input - entero;
			
			System.out.println(number.convert(number.getNumber()) + " dollars and "+ number.getCents(dec));

		}
	}
}
