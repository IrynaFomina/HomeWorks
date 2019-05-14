package hw.hw16;

public class Main {
    private static Class ClassWithAnnotations;

    public static void main(String[] args) {
        DemoAnnotation demoAnnotation = new DemoAnnotation();
        demoAnnotation.analyzeClass(ClassWithAnnotations.class);
    }
}

