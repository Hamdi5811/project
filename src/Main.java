import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<String> tasks = new ArrayList<>();
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        System.out.println("Please choose an option:");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all tasks.");
        System.out.println("(0) Exit.");


        int option = input.nextInt();
        input.nextLine();


        while (option != 0) {




            if (option == 1) {
                addTask();
            }
            else if (option == 2) {
                removeTask();
            }
            else if (option == 3) {
                updateTask();
            }
            else if (option == 4) {
                listTasks();
            }
            else {
                System.out.println("Please choose a valid option:");


            }
            System.out.println("Please choose an option:");
            input.nextLine();


            option = input.nextInt();
        }
    }








    public static void addTask() {
        System.out.println("Enter a task description:");
        input.nextLine();
        String task = input.nextLine();
        tasks.add(task);
        System.out.println("Thank you for adding:");


    }


    public static void removeTask() {
        System.out.println("Which tasks number to remove from the collection");
        input.nextLine();


        int index = input.nextInt();
        tasks.remove(index - 1);
    }


    public static void updateTask() {
        System.out.println("Which task number to update in the collection");
        int index = input.nextInt();
        input.nextLine();


        System.out.println("Enter a new task description:");
        String task = input.nextLine();
        tasks.set(index - 1, task);


    }


    public static void listTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.get(i));
        }
    }
}
