/** 
*  Write a short Java method, inputAllBaseTypes, that inputs a different value of
*  each base type from the standard input device and prints it back to the standard
*  output device.
*/
import java.util.Scanner;   // import the input scanner class

public class InputAllBaseTypes {
    // the main method
    public static void main(String[] args) {  
        InputAllBaseTypes inp = new InputAllBaseTypes();
        inp.inputAllBaseTypes();
    }
    
    // the utility methods
    public void inputAllBaseTypes() {    // input all basic data types and output the values
        Scanner input = new Scanner(System.in);
        
        // input the byte
        System.out.print("Enter an byte integer (from -128 to 127): ");
        byte byt = input.nextByte();
        
        // input the short
        System.out.print("Enter an short integer (from -32768 to 32767): ");
        short sho = input.nextShort();

        // input the int
        System.out.print("Enter an integer: ");
        int i = input.nextInt();

        // input the long 
        System.out.print("Enter an long integer: "); 
        long lon = input.nextLong();

        // input the float
        System.out.print("Enter a floating number: ");
        float flo = input.nextFloat();

        // input the double
        System.out.print("Enter a double floating number: ");
        double dou = input.nextDouble();

        // input the char
        System.out.print("Enter a character: ");
        String sTemp = input.next();
        char c = sTemp.charAt(0);

        // input the boolean
        System.out.print("Enter a boolean value: ");
        boolean bool = input.nextBoolean();

        // the outputs: 
        System.out.println("\nThe byte integer is: " + byt);
        System.out.println("The short integer is: " + sho);
        System.out.println("The integer is: " + i);
        System.out.println("The long integer is: " + lon);
        System.out.println("The floating number is: " + flo);
        System.out.println("The double floating number is: " + dou);
        System.out.println("The character is: " + c);
        System.out.println("The boolean value is: " + bool);
    }
}

