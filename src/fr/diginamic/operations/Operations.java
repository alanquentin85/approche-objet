package fr.diginamic.operations;

public class Operations {
    double a;
    double b;
    char operateur;

    public Operations(double a, double b, char operateur) {
        this.a = a;
        this.b = b;
        this.operateur = operateur;
    }

    public static double calcul(double a, double b, char operateur) {
        double result = 0;
        if (operateur == '+') {
            result =  a + b;
        }
        if (operateur == '-') {
            result =  a - b;
        }
        if (operateur == '*') {
            result = a * b;
        }
        if (operateur == '/') {
            result = a / b;
        }
        return result;
    }
}
