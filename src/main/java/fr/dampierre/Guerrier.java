package fr.dampierre;

import java.util.Random;

public class Guerrier { // NOM
    private int pv = 100; // |
    private double force = 10; // |
    // private int armure; // |ATTRIBUTS (souvent private) voir diagramme uml
    private int vitesse = 12; // |
    private String nom = "pGahide"; // |

    public void attaquer(Guerrier autre) { // METHODE

        Random rand = new Random();
        int puissMoi = rand.nextInt((int) force * vitesse);
        int puissAutre = rand.nextInt((int) autre.force * autre.vitesse);

        if (puissMoi > puissAutre) {
            autre.pv = autre.pv - 10;
        } else {
            pv = pv - 10;
        }

    }

    public boolean estEnVie() {

        return pv > 0;
    }

    public int getPv() {
        return pv;
    }

    public void afficherPv() {

        System.out.print(pv + " ");

    }

    public void init(String leNom, double force, int vitesse) {
        nom = leNom;
        this.force = force;
        this.vitesse = vitesse;
    }

}