import java.util.Scanner;


public class SquaredSum {

	public int sum(int n) {
    	if (n <= 0) // prevent from dead looping
        	return 0;
        else {
        	int s = 0; // the sum of the numbers
            
        	for (int i = n; i >= 0; i--) {  // summing up
        		s += i * i;
        	}
        	return s;
        }
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        SquaredSum foo = new SquaredSum();
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        
        int s = foo.sum(n);
        System.out.println("The sum of the square of all positive integers less than " +
        		"or equal to n is: " + s);

	}

}
