/**
 * @author Driveron
 * C-2.24
 * Write a Java class that extends the Progression class so that each value in the pro-
 * gression is the absolute value of the difference between the previous two values.
 * You should include a default constructor that starts with 2 and 200 as the first two
 * values and a parametric constructor that starts with a specified pair of numbers
 * as the first two values.
 */

public class DifferenceProgression extends Progression {
    public long prev;           // record the previous number of the current

    // Constructors
    public DifferenceProgression() { this(0, 1); }
    public DifferenceProgression(long first, long second) {
        super(first);
        prev = second + first;
    }

    // Override the advance method
    public void advance() {
        long temp = current;
        current = Math.abs(prev - current);
        prev = temp;
    }

    public static void main(String[] args) {
        DifferenceProgression prog = new DifferenceProgression(10, 17);
        System.out.println("The difference progression start with 10 and 17: ");
        prog.printProgression(50);

        prog = new DifferenceProgression();
        System.out.println("The difference progression with default starting: ");
        prog.printProgression(10);
    }
}