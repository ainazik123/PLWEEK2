import java.util.HashSet;
import java.util.Arrays;

public class Main7 {
    public static void main(String[] args) {

        HashSet<Integer> setX = new HashSet<>(Arrays.asList(
                1, 2, 3, 4, 5
        ));

        HashSet<Integer> setY = new HashSet<>(Arrays.asList(
                3, 4, 6
        ));

        setX.retainAll(setY);

        System.out.println(setX);
    }
}
