import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {
        int data[] = new int[10];
        Random rand = new Random();        // a pseudo-random number generator
        rand.setSeed(System.currentTimeMillis());

        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(100);
        }
        // make a copy of the data
        int[] orig = Arrays.copyOf(data, data.length);

        System.out.println("Arrays equal before sort: " + Arrays.equals(orig, data));
        Arrays.sort(data);
        System.out.println("Arrays equal after sort: " + Arrays.equals(orig, data));
        System.out.println("Orig: " + Arrays.toString(orig));
        System.out.println("Sorted: " + Arrays.toString(data));
    }
}