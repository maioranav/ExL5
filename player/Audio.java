package player;

public class Audio extends MediaElement implements Playable {

    private int duration = 5;
    private int volume = 4;

    public Audio(String title){
        super(title, ElType.AUDIO);
    }

    public Audio(String title, int duration){
        this(title);
        this.duration = duration;
    }

    public void abbassaVolume() {
        if (this.volume > 0) this.volume--;
        System.out.println("Volume New = " + this.volume);
    }

    public void alzaVolume() {
        if (this.volume < 5) this.volume++;
        System.out.println("Volume New = " + this.volume);
    }

    public int getDuration() {
        return this.duration;
    }

    public int getVolume() {
        return this.volume;
    }

    public String toString() {
        return getTitle() + getDuration();
    }

}
