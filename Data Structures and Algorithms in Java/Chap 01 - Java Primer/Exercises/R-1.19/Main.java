import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer larger than 2: ");
        int num = scan.nextInt();
        while (num <= 2) {
            System.out.println("Enter an integer larger than 2:  ");
            num = scan.nextInt();
        }
        
        int count = 0;
        while (num >= 2) {
            num /= 2;
            count++;
        }
        System.out.println("It should be divided " + count + " times.");
    }
}
