package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {
        System.out.println("-------------Exercice 4 : Test List String--------------");
        List<String> ville = new ArrayList<String>();
        ville.add("Nice");
        ville.add("Carcassonne");
        ville.add("Narbonne");
        ville.add("Lyon");
        ville.add("Foix");
        ville.add("Pau");
        ville.add("Marseille");
        ville.add("Tarbes");
        String a = "";
        for(String v : ville)
        {
            if(a.length() <=  v.length()){
                a = v;
            }
        }
        System.out.println(a);



    }
}
