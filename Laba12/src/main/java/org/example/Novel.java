package org.example;

public class Novel extends Book {
    String genre;
    public Novel(String title, int id, int pages, String genre) {
        super(title, id, pages);
        this.genre = genre;
    }
    @Override
    public String toString() {
        return "Novel: " + super.toString() + ", genre=" + genre;
    }
}

