public class Progression {
    // instance variable
    protected long current;

    // Constructors
    public Progression () { this(0); }    // constructs a progression starting at zero
    public Progression (long start) {     // construct with a given value
        current = start;
    }

    // returns the next value of the progression
    public long nextValue () {
        long answer = current;
        advance();             // advancing the current value
        return answer;
    }

    // advances the current value to the next value of the progression
    protected void advance() {
        current++;
    }

    // prints the next n values of the progression, separated by spaces
    public void printProgression(int n) {
        System.out.print(nextValue());
        for (int j = 1; j < n; j++) {
            System.out.print(" " + nextValue());
        }
        System.out.println();
    }
}