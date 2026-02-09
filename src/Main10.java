import java.util.HashSet;

public class Main10 {
    public static void main(String[] args) {

        String[] words = {"Apple", "apple", "APPLE", "Banana", "BANANA", "Orange"};

        HashSet<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }

        System.out.println(uniqueWords);
    }
}
