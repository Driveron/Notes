/**
 * @author Driveron
 * 
 * C-2.26 :
 * Use a solution to Exercise C-2.25 to create a new progression class for which
 * each value is the square root of the previous value, represented as a Double.
 * You should include a default constructor that has 65, 536 as the first value and a
 * parametric constructor that starts with a specified number as the first value.
 */

public class RootProgression extends Progression<Double> {
    
    // Constructors
    public RootProgression() { this(65536); }
    public RootProgression(double start) {
        super(start);
    }

    // the advance method
    public void advance() {
        current = Math.sqrt(current);
    }

    public static void main(String[] args) {
        RootProgression prog = new RootProgression(1048576);
        System.out.println("Root progression start with 1048576: ");
        prog.printProgression(10);
        
        prog = new RootProgression();
        System.out.println("Root progression with default starting: ");
        prog.printProgression(8);
    }
}