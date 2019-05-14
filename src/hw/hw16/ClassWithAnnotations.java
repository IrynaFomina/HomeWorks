package hw.hw16;

public class ClassWithAnnotations {
    private String val1 = "Test";
    @Analyzable(
            description = "Int value",
            version = "1.0")
    private int val2 = 6;


    public ClassWithAnnotations() {
    }

    @Analyzable(
            description = "Constructor for String value",
            version = "1.1"
    )
    public ClassWithAnnotations(String val1) {
        this.val1 = val1;
    }

    public ClassWithAnnotations(int val2) {
        this.val2 = val2;
    }

    private void printString (String str){
        System.out.println(str);
    }

    @Analyzable(
            description = "Val + 10",
            version = "1.2"
    )
    private int doSomeThing(int val){
        return val + 10;
    }
}
