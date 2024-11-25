import java.util.LinkedList;
import java.util.Scanner;

public class TaskLinkedList {
    private LinkedList<String> tasks; // A LinkedList to store tasks

    // It is Constructor to initialize the task list
    public TaskLinkedList() {
        tasks = new LinkedList<>();
    }

    // This is a Method to add a task to the list
    public void addTask(String description) {
        tasks.add(description);
        System.out.println("Task added to the list.");
    }

    // This is a Method to delete a task from the list
    public void deleteTask(String description) {
        
        if (tasks.remove(description)) {
            System.out.println("Task deleted from the list: ");
        } else {
           
            System.out.println("Task not found: " + description);
        }
    }

    // Method to view all tasks in the list
    public void viewTasks() {
        // Check if the task list is empty
        if (tasks.size() == 0) {
            System.out.println("No tasks in the to-do list.");
            return;
        }

        // Print the list of tasks
        System.out.println("List:");
        for (String task : tasks) {
            System.out.println("- " + task); // Print each task
        }
    }

    // My Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner for user input
        TaskLinkedList taskLinkedList = new TaskLinkedList(); // Create a TaskLinkedList instance
        String command;

        // My Display menu options
        System.out.println("---To-Do List---");
        System.out.println("\n1. Add Task");
        System.out.println("2. Delete Task");
        System.out.println("3. View All Tasks");
        System.out.println("4. Exit");

        // Loop to keep the program running until the user chooses to exit
        while (true) {
            System.out.print("\nEnter your choice: ");
            command = scanner.nextLine(); 

            switch (command) {
                case "1": // it Add task
                    System.out.print("Enter task description: ");
                    String taskDescription = scanner.nextLine().trim(); 
                    // Check if the description is not empty
                    if (!taskDescription.isEmpty()) {
                        taskLinkedList.addTask(taskDescription); // Add the task
                    } else {
                        System.out.println("No task description provided for add.");
                    }
                    break;
                case "2": // Delete task
                    System.out.print("Task:");
                    String deleteDescription = scanner.nextLine().trim(); 
                    // Check if the description is not empty
                    if (!deleteDescription.isEmpty()) {
                        taskLinkedList.deleteTask(deleteDescription); 
                    } else {
                        System.out.println("No task description provided for delete.");
                    }
                    break;
                case "3": // View all tasks
                    taskLinkedList.viewTasks(); 
                    break;
                case "4": // Exit the program
                    System.out.println("Exiting the To-Do List. Goodbye!");
                    scanner.close(); 
                    return; // Exit the loop
                default: // Handle invalid command
                    System.out.println("Invalid command. Please enter 1, 2, 3, or 4.");
                    break;
            }
        }
    }
}
