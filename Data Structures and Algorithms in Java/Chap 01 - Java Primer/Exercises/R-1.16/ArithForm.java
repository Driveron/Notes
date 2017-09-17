/**
 * Write a short program that takes as input three integers, a, b, and c, from the Java
 * console and determines if they can be used in a correct arithmetic formula (in the
 * given order), like “a + b = c,” “a = b − c,” or “a ∗ b = c.”
 * 
 * @author Driveron
 *
 */

import java.util.Scanner;

public class ArithForm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  System.out.print("Enter three integers (a, b and c): ");
		  int a = scan.nextInt();
		  int b = scan.nextInt();
		  int c = scan.nextInt();
		  
		  boolean test = true;
		  if (a + b == c) {
			  System.out.println(a + " + " + b + " = " + c);
			  test = false;
		  }
			  
		  if (a == b - c) {
			  System.out.println(a + " = " + b + " - " + c);
			  test = false;
		  }
			  	  
		  if (a * c == b) {
			  System.out.println(a + " * " + c + " = " + b);
			  test = false;
		  }
		  
		  if (test) {
			  System.out.println("They can't be in a given formula");
		  }
	}

}
