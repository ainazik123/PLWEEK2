import java.util.HashSet;

public class Main4 {
    public static void main(String[] args) {


        HashSet<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eva");


        boolean removed = names.remove("Charlie");


        System.out.println("Was removal successful? " + removed);


        System.out.println("Remaining names: " + names);
    }
}
