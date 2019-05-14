package hw.hw16;

/*1) создать аннотацию @Analyzable (может применяться к методам, конструкторам, свойствам класса)*/

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.CONSTRUCTOR,ElementType.FIELD})
public @interface Analyzable {
    String author() default "Iryna.Fomina";
    String description();
    String version();
}
