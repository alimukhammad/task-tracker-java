import java.util.ArrayList;
import java.util.Scanner;


public class AddTask{
    
    public static ArrayList<Task> tasks = new ArrayList<>();
    
    public static void add(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Task ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); //consume newline

        System.out.println("Enter Task Description: ");
        String description = scanner.nextLine();

        System.out.println("Enter Task Status: ");
        String status = scanner.nextLine();

        String createdAt = java.time.LocalDateTime.now().toString();
        String updatedAt = createdAt;

        Task newTask = new Task(id, description, status, createdAt, updatedAt); //new instance of Task object created task constructor
        tasks.add(newTask);

        System.out.println("Task Added Successfully!");
    }
}

