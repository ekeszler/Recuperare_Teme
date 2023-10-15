package Colectii.Pb4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(-1);
        list1.add(2);
        list1.add(-4);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(-2);
        list2.add(4);
        list2.add(-3);
        System.out.println(positiveNumbers(list1,list2));

    }

    public static List<Integer> positiveNumbers(List<Integer> list1, List<Integer> list2){
        List<Integer> positives = new ArrayList<>();
        for(int number: list1){
            if(number >= 0){
                positives.add(number);
            }
        }
        for(int number1: list2){
            if(number1 >= 0){
                positives.add(number1);
            }
        }
        return positives;
    }
}
