package fr.diginamic.entites;

public class Cercle implements ObjetGeometrique{
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double surface() {
        return Math.PI * perimetre() * 2;
    }

    @Override
    public String toString() {
        return "Cercle " +
                "rayon = " + rayon;
    }
}
