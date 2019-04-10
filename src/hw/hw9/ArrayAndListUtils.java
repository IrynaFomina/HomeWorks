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

    public static <V> V[]  changePlace (Object[] array, int N, int M){
        V[] newArray = (V[])array;
        V temp = (V) array[N];
        newArray[N] = (V) array[M];
        newArray[M] = temp;
        return newArray;
    }
}
