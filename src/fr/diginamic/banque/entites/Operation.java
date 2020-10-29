package fr.diginamic.banque.entites;

public abstract class Operation {
    String date;
    float montant;

    public Operation(String date, float montant) {
        this.date = date;
        this.montant = montant;
    }

    public String afficherType(){
            return "Operation :" +
                    "date = '" + date + '\'' +
                    ", montant = " + montant;
        }
}
