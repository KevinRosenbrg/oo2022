import java.util.Scanner;

public class Main {
    public static boolean session = true;
    public static void main(String[] args) {
        while (session == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type:");

            String userInput = scanner.nextLine(); // read user input
            Storage.Decipher(userInput); // choose action based on user input
            System.out.println("");

            // System.out.println("Input is: " + userInput); // test input
        }
    }

    /*

    Functionality:
    The programs is designed to be a sort of database where you can store integer count of items.
    Program reads user input and does actions based on command given. Usable commands are: add, check, remove, clear, exit.
    Command 'add' adds items to a specific list where you can specify what and how many items to add. If item already exists then it will add to current value.
    Command 'check' lists all items in a given list.
    Command 'remove' removes the specified item from the given list.
    Command 'clear' clears all items in a selected list.
    Command 'save' saves all items in a selected list to file 'storage.txt'
    Command 'exit' ends all processes and closes the program.

    Example commands:
    add list1 5 socks   // add items to list1; if item already exist then add number to current value
    check list1         // list all items with count in list1
    remove list1 socks  // removes item from list1
    clear list1         // clears list1 of all items
    save list1          // saves list1 item to 'storage.txt'
    exit                // exits the program

    */

}
