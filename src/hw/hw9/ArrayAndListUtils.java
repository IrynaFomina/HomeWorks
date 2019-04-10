package hw.hw9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayAndListUtils {
    /*a) реализовать в нем статический generic метод для смены местами элементов N и M
   параметры метода:
       исходный массив
       индекс элемента N
       интекс элемента M
   результат:
       массив где элемент N и M поменяны местами*/

    public static <V> V[]  changePlace (Class<V> clazz, int N, int M){
        V[] array = (V[]) Array.newInstance(clazz);
        V temp = array[N];
        array[N] = array[M];
        array[M] = temp;
        return array;
    }
}
