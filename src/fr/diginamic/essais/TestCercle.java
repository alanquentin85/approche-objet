package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {
    public static void main(String[] args) {
        Cercle cercle1 = new Cercle(5.5);
        Cercle cercle2 = new Cercle(2.2);
        System.out.println("-----------Perimetre des cercles-----------");
        System.out.println("cercle 1 : " + cercle1.perimetre());
        System.out.println("cercle 2 : " + cercle2.perimetre());
        System.out.println("-----------Air des cerlces-----------");
        System.out.println("cercle 1 : " + cercle1.surface());
        System.out.println("cercle 2 : " + cercle2.surface());
    }
}
