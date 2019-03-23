package hw.hw4;
/*
        - создать два массива array1, array2 размером [10][20],
        - заполнить эти массивы случайными значениями от 0 до 100
        - перемножить значение елементов массива array1 на array2, результат сохранить в массив array3*/

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int firstSize = 10;
        int secondSize = 20;
        int minRandom = 0;
        int maxRandom = 100;
        int[][] firstFactor = new int[firstSize][secondSize];
        int[][] secondFactor = new int[firstSize][secondSize];
        int[][] result = new int[firstSize][secondSize];

        for (int i = 0; i < firstFactor.length; i++) {
            for (int j = 0; j < firstFactor[i].length; j++) {
                firstFactor[i][j] = generateRandomInt(minRandom, maxRandom);
                secondFactor[i][j] = generateRandomInt(minRandom, maxRandom);
                result[i][j] = firstFactor[i][j] * secondFactor[i][j];
            }
        }

        printArray(firstFactor);
        System.out.println();
        printArray(secondFactor);
        System.out.println();
        printArray(result);
    }

    private static int generateRandomInt(int min, int max) {
        return (new Random().nextInt(max - min)) + min;
    }

    private static void printArray(int[][] array) {
        for (int[] anArray : array) {
            for (int anAnArray : anArray) {
                System.out.print(anAnArray + " ");
            }
            System.out.println();
        }
    }

}
