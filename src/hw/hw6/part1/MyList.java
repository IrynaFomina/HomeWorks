package hw.hw6.part1;

/**
 * 1) реализовать свою имплементацию интерфейса List - список в котором не может быть дубликатов;
 */

import java.util.*;

public class MyList extends ArrayList {

    @Override
    public boolean add(Object o) {
        if (!contains(o)) {
            return super.add(o);
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
            if (containsNoOne(c)) {
                return false;
            }
        return super.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection c) {
            if (!containsNoOne(c)) {
                return false;
            }
        return super.addAll(index, c);
    }


    @Override
    public Object set(int index, Object element) {
        if (!contains(element)){
            return super.set(index, element);
        }
        return null;
    }

    @Override
    public void add(int index, Object element) {
        if (!contains(element)) {
            super.add(element);
        }
    }

    @Override
    public int lastIndexOf(Object o) {
        return indexOf(o);
    }

    private boolean containsNoOne(Collection c){
        for (Object o : c) {
            if (contains(o)) {
                return false;
            }
        }
        return true;
    }
}
