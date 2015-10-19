package persona;

import java.util.Scanner;

public class Persona {
	
	private static String nombre;
	private static String apellido;
	private static String edad;
	private static String cedula;
	
	public static void main(String[]args) {
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Introduce tu nombre:");
		nombre = in.next();
		System.out.println("Introduce tu apellido:");
		apellido = in.next();
		System.out.println("Introduce tu edad:");
		edad = in.next();
		System.out.println("Introduce tu cedula:");
		cedula = in.next();
		System.out.printf("Tus datos son:\n");
		System.out.printf(nombre);
		System.out.printf(apellido);
		System.out.printf(edad);
		System.out.printf(cedula);
		
		
		
		
		
	}
	
	
	

}
