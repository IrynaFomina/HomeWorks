package hw.hw5.part3;

import java.util.Random;

public class IntUtils {

    private IntUtils() {
    }

    static int plus(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int pow(int number, int pow) { //возведение в степень
        return (int) Math.pow(number, pow);
    }

    static int getRandomInt(int minBound, int maxBount) {
        return (new Random().nextInt(maxBount - minBound)) + minBound;
    }
}
