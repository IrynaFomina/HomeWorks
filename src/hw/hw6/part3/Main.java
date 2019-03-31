package hw.hw6.part3;
/**
 * 3) создать список, заполнить его 100 случайными числами, с помоцью итератора списка:
 * - определить, сколько нечетных чисел в списке.
 * - Удалить все четные элементы через итератор
 */

import hw.hw6.part1.MyList;

import java.util.ListIterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyList newList = new MyList();
        ListIterator iterator;
        int randomSize = 100;
        int size = 100;
        Random random = new Random();
        int count = 0;

        for (int i = 0; i < size ; i++) {
            while (!newList.add(random.nextInt(randomSize)));
        }

        iterator = newList.listIterator();

        print(newList.listIterator());

        while (iterator.hasNext()){
            if ((Integer)iterator.next()%2 == 0)
                count++;
            else
                iterator.remove();
        }

        printResult(newList.listIterator(),count);
    }

    private static void printResult(ListIterator iterator, int count){
        System.out.println("Number of even elements: " + count);
        print(iterator);
    }

    private static void print (ListIterator iterator){
        if (!iterator.hasNext())
            System.out.println("List is empty.");
        else {
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            System.out.println();
        }
    }
}
