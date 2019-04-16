package hw.hw10;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        ListOfNumbers list = new ListOfNumbers("C:\\ListOfNumbers.txt");

        try {
            list.writeContentToFile("C:\\ListOfNumbers.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
