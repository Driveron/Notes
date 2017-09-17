/**
 * Write a pseudocode description of a method for finding the smallest and largest
 * numbers in an array of integers and compare that to a Java method that would do
 * the same thing.
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
	
	public void print() {   // print the information of the array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
	
	public int max() {     // find the largest number of the array
		int maxNum = -12394917;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxNum)
				maxNum = array[i];
		}
		return maxNum;
	}
	public int min() {     // find the smallest number of the array
		int minNum = 12394917;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minNum)
				minNum = array[i];
		}
		return minNum;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseArray foo = new ReverseArray(1, 2, 3, 4, 5, 6, 7);  // initialize the array
		foo.print();  // print status of the array
		foo.reverse(); // reverse the array
		foo.print();   // print the status again
		System.out.println("The largest number in the array is: " + foo.max());
		System.out.println("The smallest number in the array is: " + foo.min());
	}

}
