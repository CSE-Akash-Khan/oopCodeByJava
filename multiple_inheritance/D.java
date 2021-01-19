package multiple_inheritance;

public class D implements B,C {
    @Override
    public void foo() {
        System.out.println("Hi");
    }

    @Override
    public void run() {
        System.out.println("Run jarry run");
    }

    @Override
    public void eat() {
        System.out.println("I can eat");
    }
}
