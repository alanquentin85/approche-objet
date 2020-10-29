package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        System.out.println("-------------Exercice 1 : ArrayList--------------");
        ArrayList<Integer> numbers = new ArrayList<Integer>(100);
        for (int i = 1; i <= 100; i++)
        {
            numbers.add(i);
            System.out.println(numbers.get(i - 1));
        }
    }
}
