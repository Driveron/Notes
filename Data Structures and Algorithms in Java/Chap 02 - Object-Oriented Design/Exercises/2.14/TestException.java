
public class TestException {
    public static void main(String[] args) {
        try {
            int[] testArray = new int[3];
            testArray[4] = 10;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Don't try buffer overflow attacks in Java!");
        }
    }
}