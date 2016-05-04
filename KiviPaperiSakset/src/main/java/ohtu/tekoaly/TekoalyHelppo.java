package ohtu.tekoaly;

public class TekoalyHelppo extends Tekoaly {

    private int siirto;

    public TekoalyHelppo() {
        siirto = 0;
    }

    @Override
    public String annaSiirto(String ekanSiirto) {
        siirto = ++siirto % 3;

        switch (siirto) {
            case 0:
                return "k";
            case 1:
                return "p";
            default:
                return "s";
        }
    }
}
