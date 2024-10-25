import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
    private int id;
    private String description;
    private String status;
    private String createdAt;
    private String updatedAt;
    
    public Task(int id, String description, String status, String createdAt, String updatedAt){
        this.id = id;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        
    }

     // Getters and Setters
     public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Task ID: " + id + ", Description: " + description + ", Status: " + status + 
                ", Created At: " + createdAt + ", Updated At: " + updatedAt;
    }

    static void displayMenu(){
        System.out.println("Task Tracker Menu:");
        System.out.println("1. Add Task");
        System.out.println("2. Update Tasks");
        System.out.println("3. List Tasks");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
}
