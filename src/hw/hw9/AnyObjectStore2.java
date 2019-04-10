package hw.hw9;

import java.util.List;

public class AnyObjectStore2 {

    /* a) реализовать статический generic метод добавления объекта в лист
   параметры:
      List в который нужно добавить элемент
      Элемент который нужно добавить в лист
   результат: void*/
    private static <T extends Number> void addToList(List<T> list, T element) {
        list.add(element);
    }

    /* b) рализовать статический generic метод удаления объекта из List параметры:
      List из которого надо удалить елемент
      Элемент который нужно удалить
   результат: вернуть удаленны объект или null если такого объекта нет в листе*/
    private static <T extends Number> T removeFromList(List<T> list, T element) {
        if (list.remove(element))
            return element;
        else return null;
    }


    /*c) реализовать в этом классе статический generic метод contains
   параметры:
      List в котором надо проверить наличие элемена
      Элемент наличие которого нужно проверить
   результат: TRUE/FALSE
 !!!все методы класса AnyObjectStore2 должны работать только с классами обертками для чисел (Integer, Double etc)*/

    private static <T extends Number> boolean contains (List<T> list, T element){
        return list.contains(element);
    }
}
