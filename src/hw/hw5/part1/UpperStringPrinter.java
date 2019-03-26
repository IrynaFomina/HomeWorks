package hw.hw5.part1;

public class UpperStringPrinter extends AbstractStringPrinter {

    @Override
    void print(String str) {
        if(str != null) {
            System.out.println(str.toUpperCase());
        }
        else{
            System.out.println("Пустая строка");
        }
    }
}
