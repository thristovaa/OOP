package nl.saxion.oop.week1;

public class Video {
    private final String youtubeID, title;
    private int views;
    private boolean watched = false;

    public Video(String youtubeID, String title, int views) {
        this.youtubeID = youtubeID;
        this.title = title;
        this.views = views;
    }

    @Override
    public String toString() {
        return title + " - " + youtubeID + " (" + views + " views)";
    }

    public boolean getWatched() {
        return watched;
    }

    public void watched(){
        watched = true;
        views++;
    }
}


