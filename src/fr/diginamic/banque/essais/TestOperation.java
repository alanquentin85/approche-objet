package fr.diginamic.banque.essais;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Credit credit1 = new Credit("29/10/2020",150F);
        Credit credit2 = new Credit("06/03/2021",1000F);
        Debit  debit1  = new Debit("29/10/2020",200F);
        Debit  debit2  = new Debit("06/03/2021",1200F);

        Operation[] tab = {credit1,credit2,debit1,debit2};
        for(int i = 0; i < tab.length; i++)
        {
            System.out.println(tab[i].afficherType());
        }

    }
}
