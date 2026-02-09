import java.util.ArrayDeque;

public class Main11 {
    public static void main(String[] args) {

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Peek: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("Poll: " + queue.poll());
        }
    }
}
