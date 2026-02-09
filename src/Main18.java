import java.util.ArrayDeque;

public class Main18 {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        System.out.println("Initially: size=" + deque.size() + ", isEmpty=" + deque.isEmpty());

        deque.add(10);
        System.out.println("After add(10): size=" + deque.size() + ", isEmpty=" + deque.isEmpty());

        deque.add(20);
        System.out.println("After add(20): size=" + deque.size() + ", isEmpty=" + deque.isEmpty());

        deque.remove();
        System.out.println("After remove(): size=" + deque.size() + ", isEmpty=" + deque.isEmpty());

        deque.clear();
        System.out.println("After clear(): size=" + deque.size() + ", isEmpty=" + deque.isEmpty());
    }
}
