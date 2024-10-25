import java.util.Scanner;


public class Update{
        
    public static void update(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Task ID to Update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); //consume newline

        for(Task task : AddTask.tasks){
            
            if(task.getId() == id){
                System.out.println("Enter new description:");
                String description = scanner.nextLine();
    
                System.out.println("Enter new status: ");
                String status = scanner.nextLine();
                task.setStatus(status);
    
                String updateAt = java.time.LocalDateTime.now().toString();
                task.setUpdatedAt(updateAt);
    
                System.out.println("Task Updated Successfully!");
                return;
            }
        }

        System.out.println("Task not found...");
    }
}
