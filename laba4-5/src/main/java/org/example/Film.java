package org.example;

public class Film {
    String title;
    String director;
    double rating;

    Film(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Режиссёр: " + director);
        System.out.println("Рейтинг: " + rating);
    }

    static Film findMaxRating(Film[] films) {
        Film maxFilm = films[0];
        for (Film film : films) {
            if (film.rating > maxFilm.rating) {
                maxFilm = film;
            }
        }
        return maxFilm;
    }

    static double getAverageRating(Film[] films) {
        double sum = 0;
        for (Film film : films) {
            sum += film.rating;
        }
        return sum / films.length;
    }
}
