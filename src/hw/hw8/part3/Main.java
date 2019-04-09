package hw.hw8.part3;
/*3)

- создать linkedhashmap, занести в нее любые 10 пар ключ - значение (типа String)

- выdести на консоль значение всех ключей и значений с помощью метода entrySet()

- вывести на консоль значение всех ключей и значений с помощью метода keySet()*/

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

        System.out.println("Print out with EntrySet:");
        for (Map.Entry pair : linkedMap.entrySet()) {
            System.out.println("Key: " + pair.getKey() + " " + pair.getValue());
        }
        System.out.println("Print out with KeySet:");
        for (Integer key : linkedMap.keySet()) {
            System.out.println("Key: " + key + " " + linkedMap.get(key));
        }
    }
}
