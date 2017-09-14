import java.util.Scanner;


public class Vowel {

	public int countVowels(String s) {  // count vowels in a string 
		int count = 0; // initialize the counter
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'A' 
					|| s.charAt(i) == 'e' 
					|| s.charAt(i) == 'E' 
					|| s.charAt(i) == 'i' 
					|| s.charAt(i) == 'I' 
					|| s.charAt(i) == 'o'
					|| s.charAt(i) == 'O' 
					|| s.charAt(i) == 'u' 
					|| s.charAt(i) == 'U') 
			{
				count++; // count vowels 
			}
		}
		
		return count;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter some sentences: ");
		String s = scan.next();
		
		Vowel v = new Vowel();
		int count = v.countVowels(s);
		System.out.println("There are " + count + " vowels in these sentences");

	}

}
