package hw.hw9;
/*
2) создать в этом классе private inner class EvenIterator который реализует DataStructureIterator
(итератор должен последовательно возвращать элементы массива arrayOfInts)

3) создать в классее DataStructure метод для возврата объекта EvenIterator
*/
public class DataStructure {

    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        //заполнение массива числами от 0 до 15
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public EvenIterator getEvenIterator (int[] array){
        return null;
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> { }

    private class EvenIterator implements DataStructureIterator{
        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Integer next() {
            throw new UnsupportedOperationException();
        }
    }
}
