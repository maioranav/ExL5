package player;

public class Video extends MediaElement implements Playable, Showable {

   private int lum = 3;
    private int duration = 5;
    private int volume = 4;

    public Video(String title) {
        super(title, ElType.VIDEO);
    }

    public Video(String title, int dur) {
        this(title);
        this.duration = dur;
    }

    public Video(String title, int dur, int lum) {
        this(title, dur);
        this.duration = dur;
        this.lum = lum;
    }

    @Override
    public void abbassaVolume() {
        if (this.volume > 0) this.volume--;
        System.out.println("Volume New = " + this.volume);
    }

    @Override
    public void alzaVolume() {
        if (this.volume < 5) this.volume++;
        System.out.println("Volume New = " + this.volume);
    }

    @Override
    public int getDuration() {
        return this.duration;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void abbassaLuminosita() {
        if (lum > 0) lum--;
    }

    @Override
    public void alzaLuminosita() {
        if (lum > 0) lum--;
    }

    @Override
    public int getLuminosita() {
        return lum;
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

    public String toString() {
        return getTitle() + "" + getDuration() + "" + getLuminosita();
    }
}
