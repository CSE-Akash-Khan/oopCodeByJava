package thread;

public class MyThreadClass extends Thread{
    int id;
    MyThreadClass(int id){
        this.id = id;
    }
    public void run() {
        try {
            System.out.println("Thread class object " + id);
        }
        catch (Exception e){
        }
    }
}
