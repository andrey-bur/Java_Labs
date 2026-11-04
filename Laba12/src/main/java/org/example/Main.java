package org.example;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in=new Scanner(System.in);
        int count=in.nextInt();
        switch(count){
            case 1:
                Map<String, Book> books = new HashMap<>();
                books.put("Война и мир", new Novel("Война и мир", 1, 1225, "Роман"));
                books.put( "Преступление и наказание", new Novel("Преступление и наказание", 2, 672, "Роман"));
                books.put("Гарри Поттер", new Novel("Гарри Поттер", 3, 500, "Фэнтези"));
                books.put("Java для начинающих", new Textbook("Java для начинающих", 4, 450, "Программирование"));
                books.put("Основы математики", new Textbook("Основы математики", 5, 300, "Математика"));
                books.put("История России", new Textbook("История России", 6, 520, "История"));
                books.put("Человек-паук", new Comic("Человек-паук", 7, 100, "Стив Дитко"));
                books.put("Бэтмен", new Comic("Бэтмен", 8, 120, "Боб Кейн"));
                for (Map.Entry<String, Book> entry : books.entrySet()) {
                    System.out.println("Ключ: " + entry.getKey());
                    System.out.println("Значение: " + entry.getValue());
                    System.out.println();
                }
                break;
            case 2:

        }

    }
}
