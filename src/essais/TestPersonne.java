package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale firstAdresse = new AdressePostale("35","de la foret","44000","Nantes");
        Personne personne1 = new Personne("titi","toto",firstAdresse);
        System.out.println(personne1.nom);
        System.out.println(personne1.getNomMajuscule());
    }
}
