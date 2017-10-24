
public class GeometricProgression extends Progression {
    protected long base;

    // Constructors
    public GeometricProgression () { this(2, 1); } // set default geometric progression
    public GeometricProgression (long b) { this(b, 1); }  // set default geometric progression from 1
    public GeometricProgression (long b, long start) {
        super(start);
        base = b;
    }

    // overrides the advance method 
    // multiplies the current number with the base
    protected void advance () {
        current *= base;
    }
}