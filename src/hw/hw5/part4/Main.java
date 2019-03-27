package hw.hw5.part4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * пользователь вводит число с консоли определить сколько делителей без остатка имеет число (к примеру введено число 8
 * - количество делителей 1, 2, 4, 8)
 */
public class Main {

    public static void main(String[] args) {
        int number = getNumberFromUser();
        printResult(number, getDivisors(number));
    }

    private static int getNumberFromUser() throws InputMismatchException {
        boolean validValue = false;
        int number = 0;
        while (!validValue) {
            try {
                System.out.println("Enter an integer, please");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Entered symbol is not integer. Try again, please ");
            }
            if (number != 0) {
                validValue = true;
            }
        }
        return number;
    }

    private static int[] getDivisors(int number) {
        int resultArray[] = new int[0];
        for (int i = number; i >= 1; i--) {
            if (number % i == 0) {
                resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
                resultArray[resultArray.length - 1] = i;
            }
        }
        return resultArray;
    }

    private static void printResult(int number, int[] result) {
        System.out.print("Number " + number + " has " + result.length + " divisors : ");
        for (int i = 0; i < result.length; i++) {
            if (i < result.length - 1) {
                System.out.print(result[i] + ", ");
            } else
                System.out.println(result[i] + ".");
        }
    }
}
