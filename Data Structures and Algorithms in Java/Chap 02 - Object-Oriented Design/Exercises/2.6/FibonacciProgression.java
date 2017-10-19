
public class FibonacciProgression extends Progression {
    protected long prev;  // record the previous number of the current number

    // Constructors
    public FibonacciProgression () { this(0, 1); }  // the default Fibonacci Progression
    public FibonacciProgression (long first, long second) { // given the two starting numbers
        super(first);
        prev = second - first;     // so that second = prev + current
    }

    // Overrides the advance method
    // with Fibonacci rules
    protected void advance () {
        long temp = prev;
        prev = current;
        current = prev + temp;   // the Fibonacci rule
    }
}