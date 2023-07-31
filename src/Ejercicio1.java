import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner (System.in);
		System.out.println("Ingresa tu nombre:");
		String name= console.next(); //Eso hace que ingrese cualquier nombre
		printNameLength(name);
		printNameCharacters(name);
		console.close();
	}
		private static void printNameLength(String name) {
		
			System.out.println(name.length());
		
	}
		private static void printNameCharacters(String name) {
		
			int cantidad = String.valueOf(name).length();
			for (int num=0; num<cantidad; num++) {
				System.out.println(name.charAt(num));
			}//for
	}

}
