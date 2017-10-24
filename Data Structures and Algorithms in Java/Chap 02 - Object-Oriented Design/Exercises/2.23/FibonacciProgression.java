/**
 * C-2.23:
 * Modify the advance method of the FibonacciProgression class so as to avoid use
 * of any temporary variable.
 */


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
        current += prev;
        prev = current - prev;   // the Fibonacci rule
    }
}