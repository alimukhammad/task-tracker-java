import java.util.Scanner;

public class Delete{
    
    public static void delete(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Task ID to Delete: ");
        int id = scanner.nextInt();

        for(Task task : AddTask.tasks){
            if(task.getId() == id){
                AddTask.tasks.remove(task);
                System.out.println("Task Deleted Successfully!");
                return;
            }
        }
        System.out.println("Task not found...");
    }
}
