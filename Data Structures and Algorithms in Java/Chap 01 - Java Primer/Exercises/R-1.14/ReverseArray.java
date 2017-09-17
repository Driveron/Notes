/**
 * Write a pseudocode description of a method that reverses an array of n integers,
 * so that the numbers are listed in the opposite order than they were before, and
 * compare this method to an equivalent Java method for doing the same thing.
 * 
 * @author Driveron
 *
 */

public class ReverseArray {

	int[] array;
	
	// constructors
	public ReverseArray() {}      // the default constructor
	public ReverseArray(int... val) {
		array = new int[val.length];
		for (int i = 0; i < val.length; i++) {
			array[i] = val[i];
		}
	}
	public ReverseArray(int[] val, int n) {
		array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = val[i];
		}
	}
	
	// utilities
	public void reverse() {      // reverse the array
		int nLen = array.length;
		int[] temp =  new int[nLen];
		
		for (int i = 0; i < nLen; i++) {
			temp[i] = array[nLen - i - 1];
		}
		
		for (int i = 0; i < nLen; i++) {
			array[i] = temp[i];
		}
	}
	
	public void print() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseArray foo = new ReverseArray(1, 2, 3, 4, 5, 6, 7);  // initialize the array
		foo.print();  // print status of the array
		foo.reverse(); // reverse the array
		foo.print();   // print the status again
	}

}
