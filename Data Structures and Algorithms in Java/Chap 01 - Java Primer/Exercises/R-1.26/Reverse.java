/**
 * Write a short Java program that takes all the lines input to standard input and
 * writes them to standard output in reverse order. That is, each line is output in the
 * correct order, but the ordering of the lines is reversed.
 * 
 * @author Driveron
 */

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      // initialize the input scanner
        String sLine = "";    // the input string
        String sRev = "";     // the reversed string
        System.out.println("Enter some sentences (type 'end' to exit): ");   // inform texts

        while (true) {           // set up a loop to scan each line 
            sLine = scan.nextLine();
            if (sLine.equals("end")) {
                break;
            }
            sRev = new StringBuilder(sLine).reverse().toString();   // reverse a string
            System.out.println(sRev); 
        }
    }
}