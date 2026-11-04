package org.example;

class Book {
    String title;
    String author;
    int pages;

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    void read() {
        System.out.println("Читаю книгу");
    }

    void read(int pages) {
        System.out.println("Читаю " + pages + " страниц");
    }

    void read(String glava) {
        System.out.println("Читаю главу " + glava);
    }

    String getGenre() {
        return "Неизвестный жанр";
    }
}
