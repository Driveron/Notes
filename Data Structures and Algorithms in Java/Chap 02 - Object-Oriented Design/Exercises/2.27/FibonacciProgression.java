import java.math.BigInteger;

public class FibonacciProgression extends Progression<BigInteger> {
    protected BigInteger prev;  // record the previous number of the current number

    // Constructors
    public FibonacciProgression () { this(new BigInteger("0"), new BigInteger("1")); }  // the default Fibonacci Progression
    public FibonacciProgression (BigInteger first, BigInteger second) { // given the two starting numbers
        super(first);
        prev = second.subtract(first);     // so that second = prev + current
    }

    // Overrides the advance method
    // with Fibonacci rules
    protected void advance () {
        BigInteger temp = prev;
        prev = current;
        current = prev.add(temp);   // the Fibonacci rule
    }

    public static void main(String[] args) {
        FibonacciProgression prog = new FibonacciProgression(new BigInteger("4"), new BigInteger("6"));
        System.out.println("Fibonacci progression start with 4 and 6: ");
        prog.printProgression(10);

        prog = new FibonacciProgression();
        System.out.println("Fibonacci progression with default starting: ");
        prog.printProgression(10);
    }
}