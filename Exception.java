public class Exception {
    public static void main(String[] args) {
//        int x = 5;
//        int y = 1;
//        int result = x / y;
//        System.out.println("result " + result);
//        System.out.println("Last line of the program");
        //todo: rasie error
//        int x = 5;
//        int y = 0; //for this it's raise arithmetic exception
//        int result = x / y;
//        System.out.println("result " + result);
//        System.out.println("Last line of the program");
        //todo: handle exception
//        try {
//            int x = 5;
//            int y = 0;
//            int result = x / y;
//            System.out.println("result " + result);
//        }
//        catch (ArithmeticException e2){ //handle specific exception
//            System.out.println("Exception : " + e2);
//        }
//        catch (ArrayIndexOutOfBoundsException e3){
//            System.out.println("Error: " + e3);
//        }
//        catch (java.lang.Exception e1){//handle all exception
//            System.out.println("Exception: " + e1);
//        }
//        finally {
//            System.out.println("Last line of the program");
//            System.out.println();
//        }

        //todo: another practice
//        try {
//            int []A = new int[4];
//            A[4] = 10;
//        }
//        catch (ArithmeticException | ArrayIndexOutOfBoundsException a1 ){
//            System.out.println("Error : " + a1);
//        }
        //todo: raise error
        try {
            int x = 10;
            int y = 0;
            int result = x / y; // arithmetic exception
            int []A = new int[4];//ArrayIndexOutOfBoundsException
            System.out.println(A[5]);
        }
        catch (ArithmeticException e){
            System.err.println("you have a problem a calculate 0");
        }
        catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("er "+ e2);
        }
        finally {
            System.out.println("Finish...");
        }
    }
}
