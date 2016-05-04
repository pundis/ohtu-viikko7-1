package ohtu.main;

import java.util.Scanner;
import ohtu.kivipaperisakset.KPS;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);
    private static KPS peli;

    public static void main(String[] args) {
        while (true) {
            tulostaValikko();
            String vastaus = scanner.nextLine();
            if (vastaus.isEmpty() || (peli = KPS.luoPeli(vastaus.charAt(0))) == null) {
                break;
            }
            peli.pelaa();
        }
    }

    private static void tulostaValikko() {
        System.out.println("\nValitse pelataanko"
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetetaan");
    }
}
