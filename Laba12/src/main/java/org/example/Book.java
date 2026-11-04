package org.example;

class Book {
    String title;
    int id;
    int pages;
    public Book(String title, int id, int pages) {
        this.title = title;
        this.id = id;
        this.pages = pages;
    }
    @Override
    public String toString() {
        return "id=" + id + ", pages=" + pages;
    }
}
