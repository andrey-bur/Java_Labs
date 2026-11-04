package org.example;

class Novel extends Book {
    String style;

    Novel(String title, String author, int pages, String style) {
        super(title, author, pages);
        this.style = style;
    }

    @Override
    String getGenre() {
        return "Роман";
    }

    void read(String chapter, int pages) {
        System.out.println("Читаю главу " + chapter + ", " + pages + " страниц и стилем "+style);
    }
}