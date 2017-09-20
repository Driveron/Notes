import java.util.Scanner;

public class Array {
    public int[] dotProduct(int[] a, int[] b, int nLen) {
        int[] c = new int[nLen];
        for (int i = 0; i < nLen; i++) {
            c[i] = a[i] * b[i];
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Array foo = new Array();
        System.out.println("Enter the length of the vectors: ");
        int nLen = scan.nextInt();
        int[] a = new int[nLen];
        int[] b = new int[nLen];
        System.out.println("Enter the first array: ");
        for (int i = 0; i < nLen; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Enter the second array: ");
        for (int i = 0; i < nLen; i++) {
            b[i] = scan.nextInt();
        }
        
        // get the results: 
        int[] c = foo.dotProduct(a, b, nLen);
        System.out.println("The dot product of the two arrays are: ");
        for (int i = 0; i < nLen; i++) {
            System.out.print(c[i] + "\t");
        }
        System.out.println();
    }
}