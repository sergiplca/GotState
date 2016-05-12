package Got;

/**
 * Created by Sergi on 09/05/2016.
 */
public class Got {

    //ESTATS
    private static final int BUIT = 0;
    private static final int PLE = 1;
    private static final int DESBORDAT = 2;
    private static final int TRENCAT = 3;

    //ESTAT INICIAL
    private static int estat = BUIT;

    public static void ficar_aigua() {
        System.out.println ("Ficant aigua...");
        switch (estat) {
            case BUIT:
                estat = PLE;
                return;
            case PLE:
                estat = DESBORDAT;
                return;
            case DESBORDAT:
                return;
            case TRENCAT:
                return;
        }
    }

    public static void buidar() {
        System.out.println ("Buidant...");
        switch (estat) {
            case BUIT:
                return;
            case PLE:
                estat = BUIT;
                return;
            case DESBORDAT:
                estat = BUIT;
                return;
            case TRENCAT:
                return;
        }
    }

    public static void colpejar () {
        System.out.println ("Colpejant...");
        switch (estat) {
            case BUIT:
                estat = TRENCAT;
                return;
            case PLE:
                estat = TRENCAT;
                return;
            case DESBORDAT:
                estat = TRENCAT;
                return;
            case TRENCAT:
                return;
        }
    }

    public static String printState () {
        String s = "";
        switch (estat) {
            case BUIT:
                s = "BUIT";
                return s;
            case PLE:
                s = "PLE";
                return s;
            case DESBORDAT:
                s = "DESBORDAT";
                return s;
            case TRENCAT:
                s = "TRENCAT";
                return s;
        }
        return "";
    }
}
