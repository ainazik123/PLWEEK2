import java.util.HashSet;
import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {

        HashSet<Integer> setA = new HashSet<>(Arrays.asList(
                1, 2, 3, 4, 5
        ));

        HashSet<Integer> setB = new HashSet<>(Arrays.asList(
                3, 4
        ));

        setA.removeAll(setB);

        System.out.println(setA);
    }
}
