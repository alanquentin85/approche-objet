package fr.diginamic.entites;

public class Rectangle implements ObjetGeometrique {
    double largeur;
    double longueur;

    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    public double perimetre() {
        return largeur * 2 + longueur * 2;
    }

    @Override
    public double surface() {
        return longueur * largeur;
    }
}
