/**
*  Write a short Java method that takes an integer n and returns the sum of all
*  positive integers less than or equal to n. 
*/

import java.util.Scanner;

public class Sum {
    public int sum(int n) {
    	if (n <= 0) // prevent from dead looping
        	return 0;
        else {
        	int s = 0; // the sum of the numbers
            
        	for (int i = n; i >= 0; i--) {  // summing up
        		s += i;
        	}
        	return s;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sum foo = new Sum();
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        
        int s = foo.sum(n);
        System.out.println("The sum of all positive integers less than " +
        		"or equal to n is: " + s);
    }
    
}

