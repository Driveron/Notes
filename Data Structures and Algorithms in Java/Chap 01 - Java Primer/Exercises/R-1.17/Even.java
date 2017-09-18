/**
 * Write a short Java method that takes an array of int values and determines if there
 * is a pair of distinct elements of the array whose product is even.
 * 
 * @author Driveron
 */

import java.util.Scanner;

public class Even {
    public boolean isDistEven(int[] array) {    // finding distinct numbers whose product is even
        int nLen = array.length;
        if (nLen < 2)
            return false;

        for (int i = 0; i < nLen; i++) {
            if (array[i] % 2 == 0)
                return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Even foo = new Even();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of integers you want to put in: ");
        int nLen = scan.nextInt();  // scan the length of the integers
        int[] array = new int[nLen];
        System.out.println("Enter " + nLen + " integers: ");
        for (int i = 0; i < nLen; i++) {     // scan the list of integers
            array[i] = scan.nextInt();
        }
        
        boolean bEven = foo.isDistEven(array);
        if (bEven) {
            System.out.println("There are two distinct numbers whose product is even");
        }
        else {
            System.out.println("There are not two distinct numbers whose product is even");
        }
    }
}
