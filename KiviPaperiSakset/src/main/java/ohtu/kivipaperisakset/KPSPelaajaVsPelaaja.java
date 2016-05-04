package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KPS {

    @Override
    public String annaTokanSiirto(String ekanSiirto) {
        System.out.print("Toisen pelaajan siirto: ");
        return new Scanner(System.in).nextLine();
    }
}
