package multiple_inheritance;

public class Test {
    public static void main(String[] args) {
        D ob = new D();
        ob.eat();
        ob.foo();
        B ob2 = new D();
//        ob2.eat(); //i can't call eat methode because it is not present in the B class
        ob2.foo();
        C ob3 = new D();
        ob3.eat();
        B obj = new D();
        obj.run();
    }
}
