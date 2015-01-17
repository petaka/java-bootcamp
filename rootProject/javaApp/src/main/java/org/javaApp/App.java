package org.javaApp;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App 
{
	static Scanner sc;
    public static void main( String[] args )
    {
    	String input;
    	sc = new Scanner (System.in);
        System.out.println( "Ingrese su nombre" );
        input = sc.nextLine();
        
        System.out.println("Bienvenido, "+input);
    }
}
