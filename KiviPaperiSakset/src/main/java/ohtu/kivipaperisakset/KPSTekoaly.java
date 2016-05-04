package ohtu.kivipaperisakset;

import ohtu.tekoaly.TekoalyHelppo;
import ohtu.tekoaly.Tekoaly;

public class KPSTekoaly extends KPS {

    private Tekoaly tekoaly = new TekoalyHelppo();

    @Override
    public String annaTokanSiirto(String ekanSiirto) {
        String siirto = tekoaly.annaSiirto(ekanSiirto);
        System.out.println("Vastustajan siirto: " + siirto);
        return siirto;
    }
}
