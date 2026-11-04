package org.example;

class Textbook extends Book {
    String subject;
    public Textbook(String title, int id, int pages, String subject) {
        super(title, id, pages);
        this.subject = subject;
    }
    @Override
    public String toString() {
        return "Textbook: " + super.toString() + ", subject=" + subject;
    }
}