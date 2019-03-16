package hw.hw2;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        part1();
        part2();
        part3();
        part4();
    }

    /**
     * 1) - Создать массив элементов от 0 до 100;
     * - заполнить его случайными числами от 100 до 10 000
     * - определить максимальное и минимальное число в массиве
     **/

    private static void part1() {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000 - 100) + 100;
        }

        int minVal = array[0], maxVal = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minVal)
                minVal = array[i];
            else if (array[i] > maxVal)
                maxVal = array[i];
        }

        System.out.println("Минимальное значение: " + minVal);
        System.out.println("Максимальное значение: " + maxVal);
    }

    /**
     * 2) - Создать переменную int var,
     * - Заполнить любым целым числом
     * - С помощью циклов for, while, do while реализовать вычисление факториала от числа:
     * пример факториала от int var = 6; 6 * 5 * 4 * 3 * 2 * 1;
     **/

    private static void part2() {
        int val = 5;
        int factorial = 1;

        for (int i = 1; i <= val; i++) {
            factorial = factorial * i;
        }

        System.out.println("Факториал " + val + " равен " + factorial);
    }


    /**
     * 3) создать переменные int height; int width;
     * - заполнить случайными числами от 10 до 100
     * - вывести на консоль прямоугольник из символов '#' размером height X width
     * Например height = 10, width = 20;
     * ####################
     * ####################
     * ####################
     * ####################
     * ####################
     * ####################
     * ####################
     * ####################
     * ####################
     * ####################
     */

    private static void part3() {
        int height = new Random().nextInt(100 - 10) + 10;
        int width = new Random().nextInt(100 - 10) + 10;

        System.out.println("Квадрат с шириной " + width + " и высотой " + height + " :");
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

/*
        * 4) Аналогично заданию 3 вывести "полый" прямоугольник
* Например height = 10, width = 20;
* ####################
        * # #
        * # #
        * # #
        * # #
        * # #
        * # #
        * # #
        * # #
        * ####################
  */

    private static void part4() {
        int height = new Random().nextInt(100 - 10) + 10;
        int width = new Random().nextInt(100 - 10) + 10;

        System.out.println("Квадрат с шириной " + width + " и высотой " + height + " :");
        for (int j = 0; j < height; j++) {
            System.out.print("#");
            for (int i = 0; i < width; i++) {
                if ((i==(width-1)) || (j == 0) || (j == (height-1))) {
                    System.out.print("#");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

