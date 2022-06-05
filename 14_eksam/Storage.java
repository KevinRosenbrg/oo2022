import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Storage {
    static HashMap<String, Integer> itemList1 = new HashMap<String, Integer>();
    static HashMap<String, Integer> itemList2 = new HashMap<String, Integer>();
    static HashMap<String, Integer> itemList3 = new HashMap<String, Integer>();
    public static void Decipher(String userInput) { // decides what to do based on first word of user input

        String[] splitedInput = userInput.split("\\s+"); // split user input into words
        // System.out.println(splitedInput[0]); // test first word

        if (Objects.equals(splitedInput[0], "add")) {
            saveItem(splitedInput[1], splitedInput[2], splitedInput[3]);

        } else if (Objects.equals(splitedInput[0], "check")) {
            listStorage(splitedInput[1]);

        } else if (Objects.equals(splitedInput[0], "remove")) {
            removeItem(splitedInput[1], splitedInput[2]);

        } else if (Objects.equals(splitedInput[0], "clear")) {
            clearStorage(splitedInput[1]);

        } else if (Objects.equals(splitedInput[0], "save")) {
            saveToFile(splitedInput[1]);

        }else if (Objects.equals(splitedInput[0], "exit")) {
            System.out.println("Exiting program...");
            Main.session = false;

        } else {
            System.out.println("Command not recognized: " + splitedInput[0]);
        }
    }

    public static void saveItem(String storage, String count, String item) { // saves item into txt file or updates current value
        int itemCount = Integer.parseInt(count);
        if (Objects.equals(storage, "list1")) {
            if (itemList1.containsKey(item)) {
                itemList1.put(item, itemList1.get(item) + itemCount);
                System.out.println("Updated value of " + item);
            } else {
                itemList1.put(item, itemCount);
                System.out.println("Added " + count + " " + item + " to " + storage);
            }
        } else if (Objects.equals(storage, "list2")) {
            if (itemList2.containsKey(item)) {
                itemList2.put(item, itemList2.get(item) + itemCount);
                System.out.println("Updated value of " + item);
            } else {
                itemList2.put(item, itemCount);
                System.out.println("Added " + count + " " + item + " to " + storage);
            }
        } else if (Objects.equals(storage, "list3")) {
            if (itemList3.containsKey(item)) {
                itemList3.put(item, itemList3.get(item) + itemCount);
                System.out.println("Updated value of " + item);
            } else {
                itemList3.put(item, itemCount);
                System.out.println("Added " + count + " " + item + " to " + storage);
            }
        } else {
            System.out.println("Storage not recognized. Available storages: list1, list2, list3.");
        }
    }

    public static void removeItem(String storage, String item) { // removes item from storage
        if (Objects.equals(storage, "list1")) {
            itemList1.remove(item);
            System.out.println("Item '" + item  + "' removed from list1");
        } else if (Objects.equals(storage, "list2")) {
            itemList2.remove(item);
            System.out.println("Item '" + item  + "' removed from list2");
        } else if (Objects.equals(storage, "list3")) {
            itemList3.remove(item);
            System.out.println("Item '" + item  + "' removed from list3");
        } else {
            System.out.println("Storage not recognized. Available storages: list1, list2, list3.");
        }
    }

    public static void listStorage(String storage) { // displays item counts in given storage
        System.out.println("List of items in " + storage + ":");
        if (Objects.equals(storage, "list1")) {
            for (String i : itemList1.keySet()) { // loop through hashmap and print all values with keys
                System.out.println(i + ": " + itemList1.get(i));
            }
        } else if (Objects.equals(storage, "list2")) {
            for (String i : itemList2.keySet()) {
                System.out.println(i + ": " + itemList2.get(i));
            }
        } else if (Objects.equals(storage, "list3")) {
            for (String i : itemList3.keySet()) {
                System.out.println(i + ": " + itemList3.get(i));
            }
        } else {
            System.out.println("Storage not recognized. Available storages: list1, list2, list3.");
        }
    }

    public static void clearStorage(String storage) { // clears whole storage
        if (Objects.equals(storage, "list1")) {
            itemList1.clear();
            System.out.println("Cleared storage: " + storage);
        } else if (Objects.equals(storage, "list2")) {
            itemList2.clear();
            System.out.println("Cleared storage: " + storage);
        } else if (Objects.equals(storage, "list3")) {
            itemList3.clear();
            System.out.println("Cleared storage: " + storage);
        } else {
            System.out.println("Storage not recognized. Available storages: list1, list2, list3.");
        }
    }

    public static void saveToFile(String storage) {
        HashMap<String, Integer> list = null;
        if (Objects.equals(storage, "list1")) {
            list = itemList1;
        } else if (Objects.equals(storage, "list2")) {
            list = itemList2;
        } else if (Objects.equals(storage, "list3")) {
            list = itemList3;
        }

        if (Objects.equals(list, null)) {
            System.out.println("Nothing could be found in the list to save to file.");
        } else {
            String outputFilePath = "storage.txt";
            File file = new File(outputFilePath);
            BufferedWriter bf = null;

            try {
                bf = new BufferedWriter(new FileWriter(file));

                for (Map.Entry<String, Integer> entry :
                        list.entrySet()) {

                    bf.write(entry.getKey() + ": " + entry.getValue());
                    bf.newLine();
                }
                bf.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bf.close();
                    System.out.println("List items saved to file.");
                } catch (Exception ignored) {
                }
            }
        }
    }

}
