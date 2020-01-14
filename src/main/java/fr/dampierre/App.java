package fr.dampierre;

public final class App {

    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < 1000000000; i++) {
            Guerrier g1 = new Guerrier();
            g1.init("Ephrem", 100.0, 100);
            Guerrier g2 = new Guerrier();
            g2.init("TheoLeNulz", 100.0, 100);
            while (g1.estEnVie() && g2.estEnVie()) {
                g1.attaquer(g2);
                // g2.attaquer(g1);
                // System.out.println(g1.getPv() + " " + g2.getPv()); genere auto un combat

            }

            if (g1.estEnVie()) {
                x = x + 1;

            } else {
                y = y + 1;

            }

        }
        System.out.println();
        System.out.println("Victoires Ephrem = " + x);
        System.out.println("Victoires Theo = " + y);

    }
}