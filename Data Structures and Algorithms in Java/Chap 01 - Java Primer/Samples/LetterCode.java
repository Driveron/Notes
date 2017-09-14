import java.util.Scanner;

public class LetterCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the letter you want to transfer: ");
    /*    while(!input.hasNextChar()) {
            input.nextLine();
            System.out.print("Invalid character; Please enter an character: ");
        } */
        String sTemp = input.next();
        char c = sTemp.charAt(0);
        
        int code = c - 'a' + 1;
        System.out.println("The integer code of " + c + " is: \n" + code);
    }
}
