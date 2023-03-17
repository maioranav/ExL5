package player;

public interface Showable {

        void abbassaLuminosita();
        void alzaLuminosita();
        int getLuminosita();

    public static String printLum(Image img) {
        String strLum = "";
        for (int f = 0; f < img.getLuminosita(); f++) {
            strLum += "*";
        }
        return strLum;
    }
    public static String printLum(Video img) {
        String strLum = "";
        for (int f = 0; f < img.getLuminosita(); f++) {
            strLum += "*";
        }
        return strLum;
    }

    }

