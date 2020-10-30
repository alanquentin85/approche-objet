package listes;

import java.util.ArrayList;
import java.util.List;

public class TestVille {
    public static void main(String[] args) {
        List<Ville> ville = new ArrayList<Ville>();
        ville.add(new Ville("Nice", 343000));
        ville.add(new Ville("Carcassonne",  47800));
        ville.add(new Ville("Narbonne", 53400));
        ville.add(new Ville("Lyon", 484000));
        ville.add(new Ville("Foix", 9700));
        ville.add(new Ville("Pau", 77200));
        ville.add(new Ville("Marseille", 850700));
        ville.add(new Ville("Tarbes", 40600));
        int result =0;
        int nombreHab = 1000000000;
        for(Ville v : ville)
        {
            if(result<= v.nbHab){
                result = v.nbHab;
            }

            if(nombreHab >= v.nbHab){
                nombreHab = v.nbHab;
            }
        }
        System.out.println(result);
        System.out.println(nombreHab);
    }
}
