/**
 * Write a short Java method that uses a StringBuilder instance to remove all the
 * punctuation from a string s storing a sentence, for example, transforming the
 * string "Let’s try, Mike!" to "Lets try Mike".
 * 
 * @author Driveron
 *
 */

import java.util.Scanner;

public class Punc {

	/**
	 * remove the punctuals in a string
	 *  
	 * @param sOrig: The original stirng which is ready to be shorten
	 * @return sOut: The final output version of the string which is compressed
	 */
	public String rmPuncs(String sOrig) {
		String sOut = ""; // initialize the output string 
		for (int i = 0; i < sOrig.length(); i++) {
			if (sOrig.charAt(i) >= 'a' && sOrig.charAt(i) <= 'z')
				sOut += sOrig.charAt(i);
			else if (sOrig.charAt(i) >= 'A' && sOrig.charAt(i) <= 'Z')
				sOut += sOrig.charAt(i);
			else if (sOrig.charAt(i) == ' ')  // the spaces are retained
				sOut += sOrig.charAt(i);
		}  // others will be omitted
		
		// Debugging: 
		// System.out.println("sOut: " + sOut);
		
		return sOut;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  // initialize an input scanner
		Punc foo = new Punc();    // initialize an object of Punc to cal its methods
		System.out.println("Enter some sentences: ");
		String sOrig = scan.nextLine();  
		
		// Debugging: 
		// System.out.println("sOrig: " + sOrig);
		
		
		String sFin = foo.rmPuncs(sOrig);
		System.out.println("The storing form of the sentences is : ");
		System.out.println(sFin);
		
	}

}
