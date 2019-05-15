package hw.hw16;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/*3) метод analyze должен проверять все свойства, методы, конструкторы в классе clazz, и если они помечены аннотацией @Analyzable

   - вывести на консоль имя свойства/метода/конструктора, все аннотации которыми помечен этот элемент

   - если это метод/конструктор - то вывести на консоль имена и типы параметров метода
*/
public class DemoAnnotation implements ICodeAnalyzer {
    @Override
    public void analyzeClass(Class<?> clazz) {

        Field[] fields = clazz.getDeclaredFields();
        System.out.println("Fields: ");
        for (Field field : fields) {
            if (field.isAnnotationPresent(Analyzable.class)) {
                printAnnotations(field.getAnnotations());
                System.out.println("    " + field.getType() + " " + field.getName());
                if (field.isAnnotationPresent(Analyzable.class)) {
                }
            }
        }

        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("Methods: ");
        for (Method method : methods) {
            if (method.isAnnotationPresent(Analyzable.class)) {
                printAnnotations(method.getAnnotations());
                System.out.print("  " + method.getName());
                printParams(method.getParameters());
            }
        }

        Constructor[] constructors = clazz.getConstructors();
        System.out.println("Constructors: ");
        for (Constructor constructor : constructors) {
            if (constructor.isAnnotationPresent(Analyzable.class)) {
                printAnnotations(constructor.getAnnotations());
                System.out.print("  " + clazz.getSimpleName());
                printParams(constructor.getParameters());

            }
        }
    }

    private void printAnnotations(Annotation[] annotations) {
        for (Annotation annotation : annotations) {
            System.out.println("    @" + annotation.annotationType().getSimpleName() + " ");
        }
    }

    private void printParams(Parameter[] parameters) {
        System.out.print("(");
        for (Parameter parameter : parameters) {
            System.out.print(parameter.getType().getSimpleName() + " " + parameter.getName());
        }
        System.out.println(")");
    }
}
