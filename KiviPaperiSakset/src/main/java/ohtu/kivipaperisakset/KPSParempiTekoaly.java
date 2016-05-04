package ohtu.kivipaperisakset;

import ohtu.tekoaly.TekoalyParannettu;
import ohtu.tekoaly.Tekoaly;

// Kivi-Paperi-Sakset, jossa voi pelata ihmistä tai tekoälyä vastaan
public class KPSParempiTekoaly extends KPS {

    private Tekoaly tekoaly = new TekoalyParannettu(20);

    @Override
    public String annaTokanSiirto(String ekanSiirto) {
        String siirto = tekoaly.annaSiirto(ekanSiirto);
        System.out.println("Vastustajan siirto: " + siirto);
        return siirto;
    }
}
