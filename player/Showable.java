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

    }

