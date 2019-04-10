package hw.hw9;

import java.util.Iterator;

/*
2) создать в этом классе private inner class EvenIterator который реализует DataStructureIterator
(итератор должен последовательно возвращать элементы массива arrayOfInts)

3) создать в классее DataStructure метод для возврата объекта EvenIterator
*/
public class DataStructure implements Iterable<DataStructure> {

    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        //заполнение массива числами от 0 до 15
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i + 100;
        }
    }

    public EvenIterator getEvenIterator() {
        return new EvenIterator();
    }

    @Override
    public Iterator<DataStructure> iterator() {
        throw new UnsupportedOperationException();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {
    }

    private class EvenIterator implements DataStructureIterator {
        int cursor = -1;

        @Override
        public boolean hasNext() {
            return cursor < SIZE - 1;
        }

        @Override
        public Integer next() {
            return arrayOfInts[++cursor];
        }
    }
}
