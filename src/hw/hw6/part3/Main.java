package hw.hw6.part3;

import hw.hw6.part1.MyList;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyList newList = new MyList();
        ListIterator iterator = newList.listIterator();
        int randomSize = 100;
        int sixe = 100;
        Random random = new Random();

        for (int i = 0; i < 100 ; i++) {
            while (!newList.add(random.nextInt(randomSize)));
        }
//        while (iterator.hasNext()){
//            iterator.set(random.nextInt(randomSize));
//        }

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

    }
}
