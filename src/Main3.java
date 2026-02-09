import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {


        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        System.out.println("Size before clear: " + numbers.size());


        numbers.clear();


        System.out.println("Is empty after clear: " + numbers.isEmpty());
    }
}
