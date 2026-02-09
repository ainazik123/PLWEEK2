import java.util.ArrayDeque;

public class Main20 {
    public static void main(String[] args) {

        String input = "racecar";
        ArrayDeque<Character> deque = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            deque.add(ch);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }
}

