import java.util.Scanner;

public class CalculatorBrain {

	public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	int a;
	int b;
	System.out.println("Ingresa un valor: ");
	a=console.nextInt();
	System.out.println("Ingresa un segundo valor: ");
	b=console.nextInt();
	
	
	printSuma(a,b);
	printRes(a,b);
	printMult(a,b);
	printDiv(a,b);
	
	console.close();
	} //main
	

	private static void printSuma(Integer a, Integer b) {
		System.out.println("Suma: " + (a+b));
		} //printSuma
	
	private static void printRes(int a, int b) {
		System.out.println("Resta: "+ (a-b));
		
	}//printResta
	
	private static void printMult(Integer a, Integer b) {
	System.out.println("Multiplicación: " + (a*b));	
	}//printMult
	
	private static void printDiv(Integer a, Integer b) {
		System.out.println("División: " + (a/b));
	}//printDiv 
	
	
	} //CalculatorBrian
