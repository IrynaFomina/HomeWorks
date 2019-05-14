package hw.hw16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
/*3) метод analyze должен проверять все свойства, методы, конструкторы в классе clazz, и если они помечены аннотацией @Analyzable

   - вывести на консоль имя свойства/метода/конструктора, все аннотации которыми помечен этот элемент

   - если это метод/конструктор - то вывести на консоль имена и типы параметров метода
*/
public class DemoAnnotation implements ICodeAnalyzer{
    @Override
    public void analyzeClass(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();

        for (Field field: fields) {
            if (field.isAnnotationPresent(Analyzable.class)){
                System.out.println("Field Name:" + field.getName()
                + "Annotations: " + field.getAnnotations().toString());
            }
        }
    }

}
