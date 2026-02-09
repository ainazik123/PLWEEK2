import java.util.HashSet;
import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {

        HashSet<Integer> setA = new HashSet<>(Arrays.asList(
                1, 2, 3, 4, 5
        ));

        HashSet<Integer> setB = new HashSet<>(Arrays.asList(
                2, 3
        ));

        if (setA.containsAll(setB)) {
            System.out.println("setA contains all elements of setB");
        } else {
            System.out.println("setA does NOT contain all elements of setB");
        }
    }
}
