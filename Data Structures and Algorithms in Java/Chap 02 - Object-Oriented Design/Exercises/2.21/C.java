
class A {
    private int x;

    // Constructors
    public A() { x = 0; }
    public A(int setX) { x = setX; }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class B extends A {
    private int x;

    // Constructors
    public B() { x = 0; }
    public B(int setX) { x = setX; }

    // change the 'x' in A
    public void setAX(int x) {
        super.setX(x);
    }
    public int getAX() {
        return super.getX();
    }
}

public class C extends B {
    private int x;

    // Constructors
    public C() { x = 0; }
    public C(int setX) { x = setX; }

    // change the 'x' in A
    public void setAX(int x) {
        super.setAX(x);
    }
    public int getAX() {
        return super.getAX();
    }

    public static void main(String[] args) {
        C foo = new C();

        System.out.println("Get X in A from C: " + foo.getAX());
        System.out.println("Get X in A from A: " + ((A)foo).getX());
        foo.setAX(10);
        System.out.println("Setting X in A: 10");

        System.out.println("Get X in A from C: " + foo.getAX());
        System.out.println("Get X in A from A: " + ((A)foo).getX());
    }
}