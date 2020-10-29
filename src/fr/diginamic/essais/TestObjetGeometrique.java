package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.entites.ObjetGeometrique;
import fr.diginamic.entites.Rectangle;

import java.lang.reflect.Parameter;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,5);
        Cercle cercle1 = new Cercle(2);
        ObjetGeometrique[] tab = {cercle1, rectangle1};
        for(int i = 0; i < tab.length; i++)
        {
            System.out.println("perimetre = " + tab[i].perimetre());
            System.out.println("surface = " + tab[i].surface());
        }
    }
}
