import java.util.ArrayDeque;

public class Main14 {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        boolean firstResult = deque.offerFirst(10);
        boolean lastResult = deque.offerLast(20);
        boolean secondFirst = deque.offerFirst(5);

        System.out.println("offerFirst(10) returned: " + firstResult);
        System.out.println("offerLast(20) returned: " + lastResult);
        System.out.println("offerFirst(5) returned: " + secondFirst);

        System.out.println("Deque contents: " + deque);
    }
}
