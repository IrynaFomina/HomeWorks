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
package hw.hw9;

import java.util.Iterator;

/**
 * TODO: add description
 *
 * @author Irina.Paschenko
 */
public class Main {

    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        Iterator it = ds.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
