import java.util.Scanner;


public class OddSum {
	
	/**
	 * @param n: the summit addition number of the sum loop
	 */
	public int oddSum(int n) {
    	if (n <= 0) // prevent from dead looping
        	return 0;
        else {
        	int s = 0; // the sum of the numbers
            int i = n; // the loop iterator
        	if (n % 2 == 0)
        		i--;
        		
        	for (; i >= 0; i -= 2) {  // summing up
        		s += i;
        	}
        	return s;
        }
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        OddSum foo = new OddSum();
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        
        int s = foo.oddSum(n);
        System.out.println("The sum of all positive odd integers less than " +
        		"or equal to n is: " + s);
	}

}
