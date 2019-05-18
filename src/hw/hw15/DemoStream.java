package hw.hw15;

import java.util.*;
import java.util.stream.Collectors;

/*3) C помощью stream:

    получить Set который содержит имена студентов
    получить Map где ключ - name,значение - объект Student (1)
    получить List  студентов, отсортированных  по age
    посчитать количество студентов с списке
    посчитеть количество уникальных студентов в списке (distinct)*/

public class DemoStream {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Olga", 20, 5));
        students.add(new Student("Elena", 25, 4));
        students.add(new Student("Peter", 24, 3));
        students.add(new Student("Dan", 22, 3));
        Student s1 = (new Student("Tom", 22, 5));
        students.add(s1);
        students.add(s1);
        Set<String> names = new HashSet<>();
        Set<String> names2 = new HashSet<>();


//      получить Set который содержит имена студентов
        students.stream().forEach(s -> names.add(s.getName()));
        print(names);
        students.forEach(s -> names2.add(s.getName()));
        print(names2);

//      получить Map где ключ - name,значение - объект Student (1)

        Map<String,Student> map = new HashMap<>();
        Map<String,Student> map2 = new HashMap<>();

        students.stream().forEach(e ->map.put(e.getName(),e));
        students.forEach(e ->map2.put(e.getName(),e));
        printMap(map);
        printMap(map2);

        //      получить List  студентов, отсортированных  по age

        List<Student> list = new ArrayList();
        list = students.stream().sorted(new AgeComparator()).collect(Collectors.toList());
        print(list);


//        посчитать количество студентов с списке
        System.out.println(students.stream().count());
        System.out.println(students.size());


//        посчитеть количество уникальных студентов в списке

        System.out.println(students.stream().distinct().count());
    }

    private static void print(Collection collection) {
        collection.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    /*
    *   4) Map из пункта (1) с помощью stream:

		распечатать содержимое Map в формате ключ = знаяение, используя форматируемый вывод (String.format)

	преобразовать Map в Set который будет содержать age студентов*/

    private static void printMap (Map<String,Student> map){
//        map.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        map.entrySet().stream().forEach(e ->
            System.out.print(String.format("%1$s = %2$s \n", e.getKey(), e.getValue().toString() ))
        );
    }
}


class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAge(),o2.getAge());
    }
}