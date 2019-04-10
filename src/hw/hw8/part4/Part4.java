/*
 * Copyright (c) 1997-2013 InfoReach, Inc. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * InfoReach ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with InfoReach.
 *
 * CopyrightVersion 2.0
 */
package hw.hw8.part4;

import hw.hw8.PrintUtils;

import java.util.Map;
import java.util.TreeMap;

/**
 создать класс Test2 {
 int intField;
 String stringField;
 }
 - сделать чтобы этот класс implements Comparable
 - создать TreeMap
 - создать любое количество объектов класса тест2 и добавить их в три-мап
 - выdести на консоль значение всех ключей и значений с помощью метода entrySet()
 - вывести на консоль значение всех ключей и значений с помощью метода keySet()
 */
public class Part4 {
    public static void main(String[] args) {
        Map<Test2, String> treeMap = new TreeMap();
        Test2 element1 = new Test2(1, "A");
        Test2 element2 = new Test2(2, "B");
        Test2 element3 = new Test2(3, "C");
        treeMap.put(element3, "first");
        treeMap.put(element2, "second");
        treeMap.put(element1, "third");

        PrintUtils.printMapEntrySet(treeMap);
        PrintUtils.printMapKeySet(treeMap);
    }

}
