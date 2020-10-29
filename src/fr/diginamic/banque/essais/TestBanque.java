package fr.diginamic.banque.essais;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        System.out.println("------------TP 6-----------------");
        Compte firstCompte = new Compte("123 007 333 443 558 676",4900.56F);
        System.out.println(firstCompte.toString());
        System.out.println("------------TP 7-----------------");
        CompteTaux secondCompte = new CompteTaux("356 444 333 443 555 676",101000.00F,0.7F);
        Compte[] tab = {firstCompte,secondCompte};
        for(int i = 0; i < tab.length; i++)
        {
            System.out.println(tab[i]);
        }
    }
}
