package org.example;

class Textbook extends Book {
    String subject;

    Textbook(String title, String author, int pages, String subject) {
        super(title, author, pages);
        this.subject = subject;
    }

    @Override
    String getGenre() {
        return "Учебник";
    }

    void read(int pages, String topic) {
        System.out.println("Читаю " + pages + " страниц по теме " + topic+" и предметом "+subject);
    }
}