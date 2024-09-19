import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String name;
    private String dueDate;
    private boolean isCompleted;
    public Task(String name, String dueDate) {
        this.name = name;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }
    public String getName() {
        return name;
    }
    public String getDueDate() {
        return dueDate;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
    public String toString() {
        return name + " (Due: " + dueDate + ") - " + (isCompleted ? "Completed" : "Incomplete");
    }
}
public class TasksModerator {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markTaskCompleted();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }



    private static void addTask() {
        System.out.print("Enter task name: ");
        String name = input.nextLine();
        System.out.print("Enter due date (e.g., 2024-09-19): ");
        String dueDate = input.nextLine();

        Task task = new Task(name, dueDate);
        tasks.add(task);

        System.out.println("Task added successfully!");
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }



    private static void markTaskCompleted() {
        System.out.print("Enter task number to mark as completed: ");
        int taskNumber = input.nextInt();
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.get(taskNumber - 1).setCompleted(true);
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }
    private static void deleteTask() {
        System.out.print("Enter task number to delete: ");
        int taskNumber = input.nextInt();
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }



}
