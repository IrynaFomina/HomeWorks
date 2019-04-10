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
package hw.hw8;

import java.util.Map;

public class PrintUtils {

    public static <K,V> void  printMapEntrySet(Map<K, V> map){
        System.out.println("Print out with EntrySet:");
        for (Map.Entry<K,V> element: map.entrySet()) {
            System.out.println("Key: " + element.getKey()+ " Value: "+ element.getValue());
        }
    }

    public static <K,V> void printMapKeySet (Map<K,V> map){
        System.out.println("Print out with KeySet:");
        for (K key:map.keySet()) {
            System.out.println("Key: " + key + " Value: "+ map.get(key));
        }
    }
}
