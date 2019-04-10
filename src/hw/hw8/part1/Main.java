package hw.hw8.part1;

import hw.hw8.PrintUtils;

import java.util.HashMap;
import java.util.Map;

//*1)
//
//- создать hashmap, занести в нее любые 10 пар ключ - значение (типа String)
//- выdести на консоль значение всех ключей и значений с помощью метода entrySet()
//- вывести на консоль значение всех ключей и значений с помощью метода keySet()*/
public class Main {
    public static void main(String[] args) {
        init();
    }

    private static void init(){
        Map<Integer,String> map = new HashMap();

        for (int i = 0; i < 10; i++) {
            map.put(i,"Number is " + i);
        }

        PrintUtils.printMapEntrySet(map);
        PrintUtils.printMapKeySet(map);
    }

}
