/**
 * This file is aimed to test the hierarchy of 
 * inheritance of the Progression classes
 */

public class TestProgression {
    public static void main(String[] args) {
        Progression prog = new FibonacciProgression(2, 2);
        prog.printProgression(8);  // prints eight numbers from the start
    }
}