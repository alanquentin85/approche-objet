package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
    float tauxRemuneration;

    public CompteTaux(String num, float solde, float tauxRemuneration) {
        super(num, solde);
        this.tauxRemuneration = tauxRemuneration;
    }
    public String toString() {
        return "CompteTaux : " +
                "tauxRemuneration=" + tauxRemuneration +
                ", num='" + num + '\'' +
                ", solde=" + solde ;
    }
}
