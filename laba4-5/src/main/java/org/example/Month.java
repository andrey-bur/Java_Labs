package org.example;

enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN
}

public class Month {
    String name;
    Season season;

    Month(String name, Season season) {
        this.name = name;
        this.season = season;
    }

    static void printWinterMonths(Month[] months) {
        System.out.println("Зимние месяцы:");
        for (Month month : months) {
            if (month.season == Season.WINTER) {
                System.out.println(month.name);
            }
        }
    }
}
