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
package hw.hw9.part1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 адание на повторение Map
 1)
 - создать hashmap, занести в нее любые 10 пар ключ - значение (типа String)
 - выdести на консоль значение всех ключей и значений с помощью метода entrySet()
 - вывести на консоль значение всех ключей и значений с помощью метода keySet()

 */
public class Main {


    public static void main(String[] args)
    {
        init();
    }

    private static void init(){
        Map<Integer,String> map = new HashMap<>();
        for (Integer i = 0; i < 10; i++) {
            map.put(i,"Number is " + i) ;
        }

        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Iterator iterator = map.keySet().iterator();

        for (Integer key : map.keySet()){
            System.out.println(key+" " + map.get(key));
        }
    }
}
