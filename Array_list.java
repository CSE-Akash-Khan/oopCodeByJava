import java.util.ArrayList;
import java.util.List;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //adding
        numbers.add(10);
        numbers.add(100);
        //retrieving
//        System.out.println(numbers.get(0));
        for(int i = 0; i < 10; i++){
            numbers.add(i);
        }
        for (Integer i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        //remove items
        numbers.remove(0);
        numbers.remove(numbers.size() - 1);
        for(int i = 0; i<numbers.size(); i++){
            System.out.print(numbers.get(i) + " ");
        }
        //list interface
        List<String> item = new ArrayList<String>();
        item.add("Akash khan");
        System.out.println(item.get(0));
    }
}
