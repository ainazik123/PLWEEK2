import java.util.ArrayDeque;

public class Main16 {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);

        System.out.println("Polling sequence using poll():");
        while (!deque.isEmpty()) {
            System.out.println(deque.poll());
        }

        deque.add(50);
        deque.add(60);
        deque.add(70);

        System.out.println("Polling sequence using pollFirst():");
        while (!deque.isEmpty()) {
            System.out.println(deque.pollFirst());
        }

        deque.add(80);
        deque.add(90);
        deque.add(100);

        System.out.println("Polling sequence using pollLast():");
        while (!deque.isEmpty()) {
            System.out.println(deque.pollLast());
        }
    }
}

