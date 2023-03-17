package player;

public class MediaElement {
private String title = "";
private ElType type;
    public MediaElement(String title, ElType t) {
        this.title = title;
        this.type = t;
    }

    public ElType getType() {
        return this.type;
    }

    public String getTitle() {
        return this.title;
    }

}
