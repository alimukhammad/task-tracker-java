public class TaskList{
    
    public static void list(){
        if(AddTask.tasks.isEmpty()){
            System.out.println("No tasks found...");
        }else{
            for(Task task : AddTask.tasks){
                System.out.println(task);
            }
        }
    }
}
