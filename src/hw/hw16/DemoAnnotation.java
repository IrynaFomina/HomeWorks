package hw.hw16;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

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
                System.out.print("@");
                printAnnotations(field.getAnnotations());
                System.out.println("    " + field.getType() + " " + field.getName());
                if (field.isAnnotationPresent(Analyzable.class)) {

                }
            }
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print("Method Name: " + method.getName());
            printParams(method.getParameters());
            if (method.isAnnotationPresent(Analyzable.class)) {
                printAnnotations(method.getAnnotations());
            }
        }

        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            if (constructor.isAnnotationPresent(Analyzable.class)) {
                System.out.print("Constructor Name: " + clazz.getSimpleName());
                printParams(constructor.getParameters());
                printAnnotations(constructor.getAnnotations());
            }
        }
    }

    private void printAnnotations(Annotation[] annotations) {
        System.out.println("Annotations: ");
        for (Annotation annotation : annotations) {
            System.out.println("@"+annotation.annotationType().getSimpleName());
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
