/**
 * This file is aimed to test the hierarchy of 
 * inheritance of the Progression classes
 */

public class TestProgression {
    public static void main(String[] args) {
        Progression prog;  // use the attribute of polymorphism

        // test arithmetic progression
        System.out.print("Arithmic progression with default increment: ");
        prog = new ArithmeticProgression();
        prog.printProgression(10);

        System.out.print("Arithmetic progression with increment 7: ");
        prog = new ArithmeticProgression(7);
        prog.printProgression(10);

        System.out.print("Arithmetic progression start with 2: ");
        prog = new ArithmeticProgression(7, 2);
        prog.printProgression(10);

        // test geometric progression
        System.out.print("Geometric progression with default base: ");
        prog = new GeometricProgression();
        prog.printProgression(10);

        System.out.print("Geometric progression with base 4: ");
        prog = new GeometricProgression(4);
        prog.printProgression(10);

        // test Fibonacci progression
        System.out.print("Fibonacci progression with default start values: ");
        prog = new FibonacciProgression();
        prog.printProgression(10);

        System.out.print("Fibonacci progression start with 23 and 27: ");
        prog = new FibonacciProgression(23, 27);
        prog.printProgression(7);
    }
}