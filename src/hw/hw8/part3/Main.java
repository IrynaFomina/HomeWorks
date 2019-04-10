package hw.hw8.part3;
/*3)

- создать linkedhashmap, занести в нее любые 10 пар ключ - значение (типа String)

- выdести на консоль значение всех ключей и значений с помощью метода entrySet()

- вывести на консоль значение всех ключей и значений с помощью метода keySet()*/

import hw.hw8.PrintUtils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        Random random = new Random();
        int n = 10;

        for (int i = 0; i < n; i++) {
            linkedMap.put(i, "Value is " + random.nextInt(n));
        }

        PrintUtils.printMapEntrySet(linkedMap);
        PrintUtils.printMapKeySet(linkedMap);
    }
}
