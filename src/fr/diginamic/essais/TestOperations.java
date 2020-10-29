package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        System.out.println("operation '+' : " + Operations.calcul(3,4,'+'));
        System.out.println("operation '-' : " + Operations.calcul(4,4,'-'));
        System.out.println("operation '*': " + Operations.calcul(2,4,'*'));
        System.out.println("operation '/' : " + Operations.calcul(2,4,'/'));

    }
}
