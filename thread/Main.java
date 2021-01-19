package thread;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            MyThreadClass ob = new MyThreadClass(i);
            ob.start();//jokhon threat ta start korte bola hobe tokhon eta r line by line execute korbena object gula multiple cores ee nie jabe and execute hobe

//            ob.setPriority(Thread.MAX_PRIORITY); //todo: priority
//            ob.setPriority(Thread.MIN_PRIORITY);

            Thread ob2 = new Thread(new MyThreadInterface());
            ob2.start();
        }
    }
}
