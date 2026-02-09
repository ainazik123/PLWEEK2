import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                1, 2, 2, 3, 4, 4, 4, 5
        ));


        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);


        System.out.println("Unique values: " + uniqueNumbers);
    }
}
