package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {

     public static Cercle Cercle(double a){

         return new Cercle(a);
    }
}
