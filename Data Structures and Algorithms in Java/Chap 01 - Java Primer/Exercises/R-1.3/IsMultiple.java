import java.util.Scanner;

public class IsMultiple {
    public boolean isMultiple(int n, int m) {
        if (n % m == 0) 
            return true;
        else 
            return false;
    }
 
    public static void main(String[] args) {
        IsMultiple foo = new IsMultiple();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers (separated with spaces): ");
        int n = input.nextInt();
        int m = input.nextInt();
        if (foo.isMultiple(n, m)) 
            System.out.println(n + " is a mutiple of " + m);
        else
            System.out.println(n + " is not a mutiple of " + m);
    }
}

