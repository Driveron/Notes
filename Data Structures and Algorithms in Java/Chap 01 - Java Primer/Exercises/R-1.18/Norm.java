import java.util.Scanner;
// import java.lang.Math;

public class Norm {
    public double norm(double[] v, int p) {
        int nLen = v.length;    // get the length of the vector
        double sum = 0;         // the sum of the powers
        for (int i = 0; i < nLen; i++) {        // sum up the powers
            sum += Math.pow(v[i], (double)p);
        }
        return Math.pow(sum, (double)1/p);
    }
    public double norm(double[] v) {
        int nLen = v.length;
        double sum = 0;
        for (int i = 0; i < nLen; i++) {
            sum += Math.pow(v[i], 2.0);
        }
        return Math.sqrt(sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Norm foo = new Norm();
        System.out.println("Enter the number of numbers in your vector: ");
        int nLen = scan.nextInt();
        System.out.println("Enter the vector: ");
        double[] v = new double[nLen];
        for (int i = 0; i < nLen; i++) {
            v[i] = scan.nextDouble();
        }

        System.out.println("The 2-norm of the vector is: " + foo.norm(v));
        System.out.println("The 3-norm of the vector is: " + foo.norm(v, 3));
        System.out.print("Enter the 'p' of 'p-norm' you want to get: ");
        int p = scan.nextInt();
        System.out.println("The " + p + "-norm of the vector is: " + foo.norm(v, p));
    }
}

