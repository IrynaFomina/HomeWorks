package hw.hw4;
/*
        - создать два массива array1, array2 размером [10][20],
        - заполнить эти массивы случайными значениями от 0 до 100
        - перемножить значение елементов массива array1 на array2, результат сохранить в массив array3*/

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] array1 = new int[10][20];
        int[][] array2 = new int[10][20];
        int[][] array3 = new int[10][20];
        Random random = new Random();

        for (int i = 0; i < array1.length ; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j]=random.nextInt(100);
                array2[i][j]=random.nextInt(100);
                array3[i][j]= array1[i][j] * array2[i][j];
            }
        }
    }

}
