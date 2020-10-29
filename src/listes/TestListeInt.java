package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {
    public static void main(String[] args) {
        System.out.println("-------------Exercice 3 : Test Integer List--------------");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(-1);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(-2);
        numbers.add(4);
        numbers.add(8);
        numbers.add(5);
        System.out.println(numbers);
        System.out.println(numbers.toArray().length);
        System.out.println(Collections.max(numbers));
        Object little = Collections.min(numbers);
        numbers.remove(little);
        System.out.println(numbers);
        for(Integer i : numbers)
        {
            if (i<0){
                int index = numbers.indexOf(i);
                numbers.set(index,Math.abs(i));
            }
        }
        System.out.println(numbers);

    }

}
