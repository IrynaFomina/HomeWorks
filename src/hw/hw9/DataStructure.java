package hw.hw9;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/*
2) создать в этом классе private inner class EvenIterator который реализует DataStructureIterator
(итератор должен последовательно возвращать элементы массива arrayOfInts)

3) создать в классее DataStructure метод для возврата объекта EvenIterator
*/
public class DataStructure implements Iterable {

    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        //заполнение массива числами от 0 до 15
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i + 100;
        }
    }

    @Override
    public EvenIterator iterator() {
        return new EvenIterator();
    }

    private class EvenIterator implements Iterator {
        int[] original;
        int cursor = -1;

        EvenIterator(){
            this.original = Arrays.copyOf(arrayOfInts,SIZE);
        }

        @Override
        public boolean hasNext() {
            return cursor < SIZE - 1;
        }

        @Override
        public Integer next() {
            if (arrayOfInts[++cursor] == original[cursor]){
                return arrayOfInts[cursor];
            }
            else
            {
                throw new ConcurrentModificationException();
            }
        }
    }
}
