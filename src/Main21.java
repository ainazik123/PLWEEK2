import java.util.ArrayDeque;

public class Main21 {

    private ArrayDeque<String> taskQueue = new ArrayDeque<>();

    public void addTask(String task, boolean highPriority) {
        if (highPriority) {
            taskQueue.addFirst(task);
        } else {
            taskQueue.addLast(task);
        }
    }

    public String processTask() {
        return taskQueue.pollFirst();
    }

    public static void main(String[] args) {

        Main21 scheduler = new Main21();

        scheduler.addTask("Normal Task 1", false);
        scheduler.addTask("High Priority Task 1", true);
        scheduler.addTask("Normal Task 2", false);
        scheduler.addTask("High Priority Task 2", true);

        String task;
        while ((task = scheduler.processTask()) != null) {
            System.out.println("Processing: " + task);
        }
    }
}
