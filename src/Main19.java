import java.util.ArrayDeque;

public class Main19 {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.add(20);
        deque.add(30);

        deque.clear();

        System.out.println("After clear(): peek() = " + deque.peek());
        System.out.println("After clear(): isEmpty() = " + deque.isEmpty());
    }
}
