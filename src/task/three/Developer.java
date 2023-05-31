package task.three;

public class Developer {
    private String title;
    private String artist;
    private int duration;

    public Developer(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    String calculateDuration() {
        int minute = duration / 60;
        int second = duration % 60;
        return String.format("minute second " + minute + " " + ": " + second);

    }
}

