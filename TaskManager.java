import java.util.*;
abstract class Task{
    String title;

    Task(String title){
        this.title = title;
    }
    abstract void execute();
}
public class TaskManager {
    public static void main(String[] args) {
        List<Task>taskList=  new ArrayList<>();
        taskList.add(new Task("Buy Groceries"){
            void execute(){
                System.out.println("Task: "+ title+ "Done without hury.");
            }
        });

        taskList.add(new Task("pay electricity bill"){
            @Override
            void execute() {
                System.out.println("urgent task:"+ title+ "completed first!");
            }
        });

        //task 3: medium priority task
        taskList.add(new Task("Email project report"){
            @Override
            void execute() {
                System.out.println("✉️task"+ title+ "📅scheduled and sent.");
            }
        });

        //task 4: very high priority
        taskList.add(new Task("Attend meeting "){
            @Override
            void execute() {
                System.out.println("🔴very urgent task:"+ title+"🎤join now!");
            }
        });

        //execute all execute
        System.out.println("\n📝 Executing Task List:\n");
        for (Task t:taskList){
            t.execute();
        }
    }
}