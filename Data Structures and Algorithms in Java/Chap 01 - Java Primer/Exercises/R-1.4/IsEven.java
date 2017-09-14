/**
*  Write a short Java method, isEven, that takes an int i and returns true if and only
*  if i is even. Your method cannot use the multiplication, modulus, or division
*  operators, however.
*/

import java.util.Scanner;

public class IsEven {
    public boolean isEven(int i) {
        if (i < 0)
            i = -i; // make i positive

        while (i > 0)  // decrement i by 2 and finally it gets to 0 or -1
            i -= 2;

        if (i == 0) // now i is either 0 or -1
            return true; // if i now equals to 0, then originally it is an even number
        else  // i is not even
            return false;
    }

    public static void main(String[] args) {
        IsEven foo = new IsEven();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = input.nextInt();
        
        if (foo.isEven(i))
            System.out.println("The integer " + i + " is even");
        else
            System.out.println("The integer " + i + "is not even");
    }
}
