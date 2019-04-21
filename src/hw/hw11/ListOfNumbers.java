package hw.hw11;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfNumbers {
    private List<Integer> list;
    private static final int SIZE = 10;


    public ListOfNumbers() {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            list.add(i);
    }

//  /*
//  2) в классе ListOfNumbers создать метод writeContentToFile(String fileLocation)
//  - который должен записать в файл содержимое списка (каждое значение на новой строке) в файл fileLocation
//   если файла fileLocation не существует - создать его*/

    void writeContentToFile(String fileLocation) throws IOException {
//        File file= new File("C:\\ListOfNumbers.txt");
        File file = new File(fileLocation);

        if (!file.exists()) {
            new MyFileNotFoundException();
            createFile(fileLocation);
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < SIZE; i++) {
            writer.write(Integer.toString(list.get(i)));
            writer.newLine();
        }

        writer.close();
    }

/*    3) в классе ListOfNumbers создать метод readContentFromFile(String fileLocation)
    в котором считать из файла данные в список list из файла fileLocation (считать что в файле fileLocation каждое значение расположено на новой строке).

    если файла fileLocation не существует - реализовать собственное исключение и бросить его
    если файл пустой - реализовать собственное исключение и бросить его

    Создать класс ListOfNumbersDemo - где показать пример использования методов ListOfNumbers с обработкой всех возможных исключений.*/

    void readContentFromFile(String fileLocation) throws IOException {
        File file = new File(fileLocation);

        if (!file.exists()) {
              new MyFileNotFoundException();
              return;
        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        List<String> list = new ArrayList<>();
        String str;

        if (file.length() > 0L) {
            try {
                while ((str = bufferedReader.readLine()) != null) {
                    list.add(str);
                }
            } catch (MyIOException e) {
                new MyIOException("UPS...");
            }
        }
        else {
            new EmptyFileException();
            return;
        }
        printList(list);
    }

    private void printList(List list){
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public void createFile(String fileLocation){
        try {
            File file = new File(fileLocation);
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


class MyFileNotFoundException extends FileNotFoundException {
    public MyFileNotFoundException() {
        System.out.println("File doesn't exist");
    }
}

class MyIOException extends IOException {
    public MyIOException(String message) {
        System.out.println(message);
    }
}

class EmptyFileException extends Exception{
    public EmptyFileException()
    {
        System.out.println("File is empty");
    }
}