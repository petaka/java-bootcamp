package house;

public class Main {
	public static void main(String[] args) {
		House h1 = new House("Calle falsa 123", 120.00, 3, 3500);
		System.out.println(h1);
		h1.setPrecioAlquiler(3850);
		House h2 = new House("Avenida Siempreviva 3742", 100.00, 2, 2500);
		System.out.println(h1);
		System.out.println(h2);
	}

}
