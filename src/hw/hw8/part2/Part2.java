package hw.hw8.part2;

import hw.hw8.PrintUtils;

import java.util.HashMap;
import java.util.Map;

/*- создать класс Test {
   int intField;
   String stringField;
}

- переопределить методы equals и hashCode
- создать любое количество объектов класса тест
- добавить их в HashMap в качестве ключей и значений
- выdести на консоль значение всех ключей и значений с помощью метода entrySet()
- вывести на консоль значение всех ключей и значений с помощью метода keySet()*/
public class Part2 {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        Test t1 = new Test(1, "first");
        Test t2 = new Test(2, "second");
        Test t3 = new Test(3, "third");
        Test t4 = new Test(4, "fourth");
        map.put(t1.intField,t1.stringField);
        map.put(t2.intField,t2.stringField);
        map.put(t3.intField,t3.stringField);
        map.put(t4.intField,t4.stringField);

        PrintUtils.printMapEntrySet(map);
        PrintUtils.printMapKeySet(map);

    }
}
