package hw.hw5.part1;

public class LowerStringPrinter extends AbstractStringPrinter {
    @Override
    void print(String str) {
        if (str != null) {
            System.out.println(str.toLowerCase());
        }
        else{
            System.out.println("Пустая строка");
        }
    }
}
