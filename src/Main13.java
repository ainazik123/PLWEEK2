import java.util.ArrayDeque;

public class Main13 {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(30);

        for (Integer num : deque) {
            System.out.println(num);
        }
    }
}
