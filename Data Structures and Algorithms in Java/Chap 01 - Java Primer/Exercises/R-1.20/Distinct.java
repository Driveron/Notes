import java.util.Scanner;

public class Distinct {
    public boolean isDistinct(float[] array) {     // judge if there are two components are equal
        int nLen = array.length;
        for (int i = 0; i < nLen; i++) {           // two for-loops to get through the array
            for (int j = 0; j < i; j++) {
                if (Math.abs(array[j] - array[i]) <= 0.0001)   // judge if two floating values are equal
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);     // initialize the input scanner
        Distinct foo = new Distinct();             // initialize the object instance
        System.out.println("Enter the number of values in the array: ");
        int nLen = scan.nextInt();
        System.out.println("Enter the array contents: ");
        float[] array = new float[nLen];
        for (int i = 0; i < nLen; i++) {
            array[i] = scan.nextFloat();
        }
        
        boolean bDist = foo.isDistinct(array);
        if (bDist) {
            System.out.println("The numbers in the array are distinct");
        }
        else {
            System.out.println("There are at least two numbers equal");
        }
    }
}
