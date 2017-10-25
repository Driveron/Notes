public abstract class Progression <T> {
    // instance variable
    protected T current;

    // Constructors
    public Progression (T start) {     // construct with a given value
        current = start;
    }

    // returns the next value of the progression
    public T nextValue () {
        T answer = current;
        advance();             // advancing the current value
        return answer;
    }

    // advances the current value to the next value of the progression
    protected abstract void advance();

    // prints the next n values of the progression, separated by spaces
    public void printProgression(int n) {
        System.out.print(nextValue());
        for (int j = 1; j < n; j++) {
            System.out.print(" " + nextValue());
        }
        System.out.println();
    }
}