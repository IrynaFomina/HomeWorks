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
import java.sql.Types.*;

/**
 * TODO: add description
 *
 * @author Irina.Paschenko
 */
public interface IPrintMap {
    static <K,V> void  printMapEntrySet(Map<K, V> map){
        System.out.println("Print out with EntrySet:");
        for (Map.Entry<K,V> element: map.entrySet()) {
            System.out.println("Key: " + element.getKey()+ " Value: "+ element.getValue());
        }
    }
//    void printMapKeySet(Map map);
}
