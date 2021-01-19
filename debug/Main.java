package debug;

public class Main {
    public static void main(String[] args)
    {
        GradData myobj = new GradData();//its a constructor without parameter
        System.out.println("Student Name is: "+myobj.getgradName());
        System.out.println("Student Age is: "+myobj.getgradAge());
        System.out.println("Student ID is: "+myobj.getgradID());
        GradData myobj2 = new GradData(555, "Chaitanya", 25); //it's a constructor with parameter
        System.out.println("Student Name is: "+myobj2.getgradName());
        System.out.println("Student Age is: "+myobj2.getgradAge());
        System.out.println("Student ID is: "+myobj2.getgradID());
    }

}
