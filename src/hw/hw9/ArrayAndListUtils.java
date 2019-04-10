package hw.hw9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndListUtils{
    /*a) реализовать в нем статический generic метод для смены местами элементов N и M
   параметры метода:
       исходный массив
       индекс элемента N
       интекс элемента M
   результат:
       массив где элемент N и M поменяны местами*/

    public static <V> V[] changePlace(Object[] array, int N, int M) {
        V[] newArray = (V[]) array;
        V temp = (V) array[N];
        newArray[N] = (V) array[M];
        newArray[M] = temp;
        return newArray;
    }

    /*   b) реализовать статический generic метод для поиска в List максимального елемента начиная с позиции N и заканчивая позицией M
       !!! сделать чтобы generic тип реализовывал Comparable
       параметры метода:
           исходный лист
           индекс элемента N
           интекс элемента M
       результат:
           максимальный объект
*/

/*<T extends Comparable> так правильно определить или так<T extends Comparable<T>> ????*/

    public static <T extends Comparable> T findMaxValue(List<T> list, int N, int M) {
        T maxValue = list.get(N);
        for (int i = N; i < M; i++) {
            if (list.get(i + 1).compareTo(maxValue) > 0) {
                maxValue = list.get(i + 1);
            }
        }
        return maxValue;
    }
}
