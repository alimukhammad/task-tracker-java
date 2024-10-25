import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskTracker {

    static List<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markTaskComplete(scanner);
                    break;
                case 4:
                    System.out.println("Exiting Task Tracker...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void displayMenu() {
        System.out.println("\nTask Tracker Menu:");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Mark Task Complete");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    static void addTask(Scanner scanner) {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        tasks.add(new Task(description));
        System.out.println("Task added successfully!");
    }

    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks added yet.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    static void markTaskComplete(Scanner scanner) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to mark complete.");
            return;
        }

        viewTasks();
        System.out.print("Enter task number to mark complete: ");
        int taskNumber = scanner.nextInt();

        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            Task task = tasks.remove(taskNumber - 1);
            System.out.println("Task \"" + task.description + "\" marked complete.");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}

class Task {
    String description;
    boolean isComplete;

    public Task(String description) {
        this.description = description;
        this.isComplete = false;
    }

    @Override
    public String toString() {
        return description + (isComplete ? " (Complete)" : "");
    }
}