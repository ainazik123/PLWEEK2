import java.util.HashSet;

public class Main2 {


    static HashSet<String> allowedUsers = new HashSet<>();


    public static boolean isAllowed(String name) {
        return allowedUsers.contains(name);
    }

    public static void main(String[] args) {


        allowedUsers.add("Alice");
        allowedUsers.add("Bob");
        allowedUsers.add("Charlie");

        // Проверка
        System.out.println(isAllowed("Alice"));   // true
        System.out.println(isAllowed("David"));   // false
    }
}
