import java.util.HashSet;

public class Main9 {
    public static void main(String[] args) {

        String sentence = "java is fun and java is powerful";

        String[] words = sentence.split(" ");

        HashSet<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }

        System.out.println(uniqueWords);
    }
}
