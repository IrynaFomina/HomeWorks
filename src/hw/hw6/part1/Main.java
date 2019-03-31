//package hw.hw6.part1;
//
//import java.util.Iterator;
//import java.util.Random;
//
//public class Main {
//
//
//    public static void main(String[] args) {
//        init();
//    }
//
//    private static void init(){
//        MyList firstMyList = new MyList();
//        MyList secondMyList= new MyList();
//        MyList result= new MyList();
//        Random random = new Random();
//        int minBoard = 100;
//        int maxBoard = 200;
//        int firstArraySize =random.nextInt(maxBoard-minBoard)+minBoard;
//        int secondArraySize =random.nextInt(maxBoard-minBoard)+minBoard;
//
//        for (int i = 0; i < firstArraySize; i++) {
//            while(!firstMyList.add(random.nextInt(maxBoard-minBoard)+minBoard));
//        }
//
//        for (int i = 0; i < secondArraySize; i++) {
//            while(!secondMyList.add(random.nextInt(maxBoard-minBoard)+minBoard));
//        }
//
//        int firstIndex;
//        int secondIndex;
//        if (firstArraySize >= secondArraySize){
//            firstIndex = firstArraySize;
//            secondIndex = secondArraySize;
//        }
//        else{
//            firstArraySize = secondArraySize;
//            secondArraySize = firstArraySize;
//        }
//
//        for (int i = 0; i < firstArraySize; i++) {
//            if (j<secondArraySize){
//                result.add();
//            }
//
//        }
//    }
//}
