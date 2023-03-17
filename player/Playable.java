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

}
