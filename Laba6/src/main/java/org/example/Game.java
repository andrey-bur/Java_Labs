package org.example;

public class Game {
    private String title;
    private String genre;
    private int rating;

    private int count;



    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public boolean isTop() {
        return getRating() >= 9;
    }

    public Game(String title, String genre, int rating) {
        this.genre = genre;
        this.title = title;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("""
                Name: %s,
                Genre: %s,
                Rating: %d.
                """, title, genre, rating);
    }
}
