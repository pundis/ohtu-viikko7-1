package ohtu.kivipaperisakset;

import ohtu.tekoaly.Tuomari;
import java.util.Scanner;

public abstract class KPS {

    private Tuomari tuomari;

    public static KPS luoPeli(char c) {
        switch (c) {
            case 'a':
                return new KPSPelaajaVsPelaaja();
            case 'b':
                return new KPSTekoaly();
            case 'c':
                return new KPSParempiTekoaly();
            default:
                return null;
        }
    }

    public void pelaa() {
        tuomari = new Tuomari();
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");

        while (true) {
            String ekanSiirto = annaEkanSiirto();
            String tokanSiirto = annaTokanSiirto(ekanSiirto);
            
            if (!onkoOkSiirto(ekanSiirto) || !onkoOkSiirto(tokanSiirto)) {
                lopeta();
            }
            
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
        }
    }

    private String annaEkanSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        return new Scanner(System.in).nextLine();

    }

    public abstract String annaTokanSiirto(String ekanSiirto);

    private boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    private void lopeta() {
        System.out.println("\nKiitos!");
        System.out.println(tuomari);
        System.exit(0);
    }
}
