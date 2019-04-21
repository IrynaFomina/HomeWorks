package hw.hw11;

import java.io.IOException;

public class ListOfNumbersDemo {
    public static void main(String[] args) {
        ListOfNumbers list = new ListOfNumbers();

        try {
            list.readContentFromFile("C:\\ListOfNumbers1.txt");  // File doesn't exist
            list.createFile("C:\\ListOfNumbers.txt");
            list.readContentFromFile("C:\\ListOfNumbers.txt"); // File is empty
            list.writeContentToFile("C:\\ListOfNumbers.txt");
            list.readContentFromFile("C:\\ListOfNumbers.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
