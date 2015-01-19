import java.util.Scanner;
public class Main {

	static Scanner sc = new Scanner (System.in);
	static Word word;
	public static void main(String[] args) {
		
		System.out.println("Ingrese la cadena");
		String chain = sc.nextLine();
		System.out.println("Ingrese la longitud");
		int row = sc.nextInt();
		word = new Word(chain);
		System.out.println("El resultado es: " + word.wrap(word.getWord(), row)  );
	}

}
