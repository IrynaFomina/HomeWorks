package hw.hw9;

import java.util.Set;

public class AnyObjectStore1<T> {
    Set<T> set;
    private void add (T element){
        set.add(element);
    }

    private void remove (T element){
        set.remove(element);
    }

    private boolean contains (T element){
        return set.contains(element);
    }
}
