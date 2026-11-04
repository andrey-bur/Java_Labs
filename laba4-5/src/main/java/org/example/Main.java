package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Car car = new Car("BMW", "X5", 2020, 50000);
        car.displayInfo();
        System.out.println(car);


        Film[] films = {
                new Film("Интерстеллар", "Кристофер Нолан", 8.7),
                new Film("Начало", "Кристофер Нолан", 8.8),
                new Film("Матрица", "Вачовски", 8.7),
                new Film("Зелёная миля", "Фрэнк Дарабонт", 8.6),
                new Film("Гладиатор", "Ридли Скотт", 8.5),
                new Film("Форрест Гамп", "Роберт Земекис", 8.8)

        };
        Film maxFilm = Film.findMaxRating(films);
        System.out.println("Фильм с максимальным рейтингом:");
        maxFilm.displayInfo();
        double average = Film.getAverageRating(films);
        System.out.println("\nСредний рейтинг: " + average);


        Month[] months = {
                new Month("Январь", Season.WINTER),
                new Month("Февраль", Season.WINTER),
                new Month("Март", Season.SPRING),
                new Month("Апрель", Season.SPRING),
                new Month("Май", Season.SPRING),
                new Month("Июнь", Season.SUMMER),
                new Month("Июль", Season.SUMMER),
                new Month("Август", Season.SUMMER),
                new Month("Сентябрь", Season.AUTUMN),
                new Month("Октябрь", Season.AUTUMN),
                new Month("Ноябрь", Season.AUTUMN),
                new Month("Декабрь", Season.WINTER)
        };
        Month.printWinterMonths(months);

    }
}

