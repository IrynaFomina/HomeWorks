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

/**
 * TODO: add description
 *
 * @author Irina.Paschenko
 */
public class Test2 implements Comparable<Test2> {
    private int intField;
    private String stringField;

    public Test2(int intField, String stringField) {
        this.intField = intField;
        this.stringField = stringField;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "intField=" + intField +
                ", stringField='" + stringField + '\'' +
                '}';
    }

    @Override
    public int compareTo(Test2 test2) {
        int result = this.stringField.compareTo(test2.stringField);
        return result;
    }
}
