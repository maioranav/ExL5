package player;

public class Image extends MediaElement implements Showable{

    private int lum = 4;

    public Image(String title) {
        super(title, ElType.IMAGE);
    }

    public Image(String title, int lum) {
        this(title);
        this.lum = lum;
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

    public static void show(Image img) {
            String toPrint = img.getType() + ": " + img.getTitle() + " | L: ";
            toPrint += Showable.printLum(img);
            System.out.println(toPrint);
    }

    public String toString() {
        return getTitle();
    }

}
