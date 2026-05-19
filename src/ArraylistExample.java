import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    static void main(String[] args) {

        //syntax of creating arraylist
ArrayList<Integer> list=new ArrayList<>(5);
        Scanner in=new Scanner(System.in);
//
//list.add(30);
//list.add(50);
//        list.add(30);
//        list.add(50);
//        list.add(300);
//        list.add(509);
//        list.add(300);
//        list.add(506);
//        list.add(308);
//        list.add(506);
//        list.add(304);
//        list.add(504);
//
//        boolean list2=list.contains(679);  //if the number is containing the list
//
//        System.out.println(list2);
//
//
//        System.out.println(list);
//
//        list.set(0,80000);
//
//        list.remove(1);
//        System.out.println(list);

        for (int i = 0; i <5 ; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i <5 ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);

    }
}
