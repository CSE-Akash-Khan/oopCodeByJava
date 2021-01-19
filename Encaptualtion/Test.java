package Encaptualtion;

public class Test {
    public static void main(String[] args) {
//        Shape s1 = new Shape();//its parent class
//        Shape s2 = new Rectangle(10,20); // called child class constructor
//        Shape s3 = new Triangle(10,20);//called child class constructor from parent class (shape)
//        System.out.println(s1.area());
//        System.out.println(s2.area());
//        System.out.println(s3.area());
        Shape s1;
        s1 = new Rectangle(10,20);//we can use parent class variable for making child class object.
        System.out.println(s1.area());
        s1 = new Triangle(10,20);
        System.out.println(s1.area());

    }
    //Todo: i can use parent class object for call his all child class
}
