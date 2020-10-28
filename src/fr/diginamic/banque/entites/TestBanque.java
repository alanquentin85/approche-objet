package fr.diginamic.banque.entites;

public class TestBanque {
    public static void main(String[] args) {
        Compte firstCompte = new Compte("123 007 333 443 558 676",4900.56F);
        System.out.println(firstCompte.num);
        System.out.println(firstCompte.solde);
    }
}
