import java.util.ArrayDeque;

public class Main12 {
    public static void main(String[] args) {

        ArrayDeque<String> stack = new ArrayDeque<>();

        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
