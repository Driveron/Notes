/**
 * This file implements the arithmetic progression 
 * which changes value by adding a stable value to
 * the previous value. The implementation uses inheritance
 */

public class ArithmeticProgression extends Progression {
    protected long increment;

    // Constructors
    public ArithmeticProgression () { this(1, 0); }  // using default progression
    public ArithmeticProgression (long stepsize) {   // start from 0 by default
        this(stepsize, 0);
    }
    public ArithmeticProgression (long stepsize, long start) {   // the full constructor
        super(start);
        increment = stepsize;
    }

    // override the advance type
    // add increment number to the current number
    protected void advance () {
        current += increment;
    }


}