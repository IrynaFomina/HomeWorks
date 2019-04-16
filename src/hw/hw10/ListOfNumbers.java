package hw.hw10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    private List<Integer> list;
    private static final int SIZE = 10;


    public ListOfNumbers(String fileLocation) {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            list.add(new Integer(i));
    }

//  /*
//  2) в классе ListOfNumbers создать метод writeContentToFile(String fileLocation)
//  - который должен записать в файл содержимое списка (каждое значение на новой строке) в файл fileLocation
//   если файла fileLocation не существует - создать его*/

    public void writeContentToFile(String fileLocation) throws IOException {
//        File file= new File("C:\\ListOfNumbers.txt");
        File file = new File(fileLocation);
        FileWriter writer = new FileWriter(file);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < SIZE; i++) {
            String str = Integer.toString(list.get(i)) + "\n";
            writer.write(str);
            writer.write("\n");
            writer.flush();
        }
    }
}