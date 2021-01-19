//public class ExceptionThrow {
//    static void validate(int age)throws Invalid{
//        if(age < 18){
//            throw new InvalidAgeException("not valid");
//        }
//        else {
//            System.out.println("welcome to vote");
//        }
//    }
//
//    public static void main(String[] args) {
//        try {
//            validate(13);
//        }catch (InvalidAgeException e){
//            System.out.println(e);
//        }
//        System.out.println("Rest of the code..");
//    }
//}