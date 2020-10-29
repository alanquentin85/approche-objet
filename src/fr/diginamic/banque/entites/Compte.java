package fr.diginamic.banque.entites;

public class Compte {
    String num;
    float solde;

    public Compte(String num, float solde) {
        this.num = num;
        this.solde = solde;
    }
    public String toString() {
        return "Compte :" +
                "num='" + num + '\'' +
                ", solde=" + solde;
    }
}
