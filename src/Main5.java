import java.util.HashSet;
import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {


        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(
                1, 2, 3
        ));


        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(
                3, 4, 5
        ));


        set1.addAll(set2);


        System.out.println("Resulting set1: " + set1);
    }
}
