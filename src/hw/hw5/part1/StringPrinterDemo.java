package hw.hw5.part1;

import java.util.Scanner;

public class StringPrinterDemo {
    public static void main(String[] args) {
        init();
    }

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some string");
        String newString = scanner.next();
        boolean isfinished = false;
        while (!isfinished) {
            System.out.println("Please enter string printer type (U - upper, L - lower)");
            String type = scanner.next();

            switch (type) {
                case "U":
                    new UpperStringPrinter().print(newString);
                    isfinished = true;
                    break;
                case "L":
                    new LowerStringPrinter().print(newString);
                    isfinished = true;
                    break;
                default:
                    System.out.println("Unsupported type. Try again");
            }
        }
    }
}
