package hw.hw6.part2;
/**
 * 2)
 * -создать два списка;
 * - сгенерировать 2 случайных числа от 100 до 200 (M, N)
 * - заполнить список 1 M случайными числами
 * - заполнить список 2 N случайными числами
 * - перемножить все элементы списка, и результат сохранить в третий список
 * Пример:
 * 1-й список содержит 1, 2 ,3
 * 2-й список содержит 6, 8, 8, 9, 9, 10
 * 3- й список должен содержать 6, 16, 24, 9, 9, 10
 */

import hw.hw6.part1.MyList;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        init();
    }

    private static void init() {
        MyList firstMyList = new MyList();
        MyList secondMyList = new MyList();
        MyList result = new MyList();
        Random random = new Random();
        int minSize = 100;
        int maxSize = 200;
        int minNumber = 0;
        int maxNumber = 200;
        int firstArraySize = random.nextInt(maxSize - minSize) + minSize;
        int secondArraySize = random.nextInt(maxSize - minSize) + minSize;

        generateList(firstMyList, firstArraySize, minNumber, maxNumber);
        generateList(secondMyList, secondArraySize, minNumber, maxNumber);

        Iterator firstIterator = firstMyList.iterator();
        Iterator secondIterator = secondMyList.iterator();

        while (true) {
            if (firstIterator.hasNext() && secondIterator.hasNext())
                result.add((Integer) firstIterator.next() * (Integer) secondIterator.next());
            else if (!firstIterator.hasNext() && !secondIterator.hasNext())
                break;
            else if (!secondIterator.hasNext())
                result.add(firstIterator.next());
            else
                result.add(secondIterator.next());
        }

        print(firstMyList.listIterator());
        print(secondMyList.listIterator());
        print(result.listIterator());
    }

    private static void print(ListIterator iterator) {
        if (!iterator.hasNext())
            System.out.println("List is empty.");
        else {
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            System.out.println();
        }
    }

    private static void generateList(List list, int size, int min, int max) {
        for (int i = 0; i < size; i++) {
            while (!list.add(new Random().nextInt(max - min) + min)) ;
        }
    }
}
