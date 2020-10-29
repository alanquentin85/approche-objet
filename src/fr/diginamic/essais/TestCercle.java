package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {
    public static void main(String[] args) {
        Cercle cercle1 = new Cercle(5.5);
        Cercle cercle2 = new Cercle(2.2);
        System.out.println("-----------Perimetre des cercles-----------");
        System.out.println("cercle 1 : " + cercle1.perimetre());
        System.out.println("cercle 2 : " + cercle2.perimetre());
        System.out.println("-----------Air des cercles-----------");
        System.out.println("cercle 1 : " + cercle1.surface());
        System.out.println("cercle 2 : " + cercle2.surface());
        Cercle cercle3 = CercleFactory.Cercle(2);
        System.out.println("-----------Creation cercles-----------");
        System.out.println(cercle3.toString() + "\n"+ "Perimetre du cercle = "+ cercle3.perimetre()+"\n"+"Surface du cercle = "+cercle3.surface());
    }
}
