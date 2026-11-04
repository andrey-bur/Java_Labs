package org.example;

class Comic extends Book {
    String illustrator;
    public Comic(String title, int id, int pages, String illustrator) {
        super(title, id, pages);
        this.illustrator = illustrator;
    }
    @Override
    public String toString() {
        return "Comic: " + super.toString() + ", illustrator=" + illustrator;
    }
}