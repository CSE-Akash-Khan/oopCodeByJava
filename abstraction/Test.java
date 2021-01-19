package abstraction;

public class Test {
    public static void main(String[] args) {
        Mobile_user mu;
        mu = new Rahim();
        mu.send_message();
        mu = new Karim();
        mu.send_message();
    }
}
