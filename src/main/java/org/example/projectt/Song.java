package org.example.projectt;
import java.sql.Time;

public class Song {
    private int id;
    private String title;
    private String genre;
    private Time duration;
    private int releaseYear;

    public Song(int id, String title, String genre, Time duration, int releaseYear) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.releaseYear = releaseYear;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public Time getDuration() { return duration; }
    public void setDuration(Time duration) { this.duration = duration; }

    public int getReleaseYear() { return releaseYear; }
    public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }
}
