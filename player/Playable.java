package player;

public interface Playable {
    void abbassaVolume();
    void alzaVolume();
    int getDuration();
    int getVolume();

    public static void play(Audio aud) {
        for (int i = 0; i < aud.getDuration(); i++) {
            String toPrint = aud.getType() + ": " + aud.getTitle() + " | D: " + aud.getDuration() + " | V: ";
            for(int f = 0; f < aud.getVolume(); f++) {
                toPrint += "!";
            }
            System.out.println(toPrint);
        }
    }

    public static void play(Video vid) {
        for (int i = 0; i < vid.getDuration(); i++) {
            String toPrint = vid.getType() + ": " + vid.getTitle() + " | D: " + vid.getDuration() + " | V: ";
            for(int f = 0; f < vid.getVolume(); f++) {
                toPrint += "!";
            }
            toPrint += " | L: " + Showable.printLum(vid);;
            System.out.println(toPrint);
        }
    }

}
