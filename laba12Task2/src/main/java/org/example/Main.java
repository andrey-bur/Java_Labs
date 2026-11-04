package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void main() {
                List<Athlete> athletes = new ArrayList<>();
                athletes.add(new Athlete(1, "Андрей", "Волейбол", 2, Arrays.asList(5, 4, 5)));
                athletes.add(new Athlete(2, "Иван", "Футбол", 1, Arrays.asList(2, 3, 2)));
                athletes.add(new Athlete(3, "Максим", "Баскетбол", 3, Arrays.asList(5, 5, 4)));
                athletes.add(new Athlete(4, "Алексей", "Волейбол", 2, Arrays.asList(3, 3, 3)));
                athletes.add(new Athlete(5, "Дмитрий", "Теннис", 1, Arrays.asList(4, 4, 5)));
                athletes.removeIf(a -> a.getAverageResult() < 3);
                for (Athlete athlete : athletes) {
                    if (athlete.getAverageResult() >= 4) {
                        athlete.setLevel(athlete.getLevel() + 1);
                    }
                }
                System.out.println("Спортсмены 3 уровня:");
                for (Athlete athlete : athletes) {
                    if (athlete.getLevel() == 3) {
                        System.out.println(athlete.getName());
                    }
                }
                athletes.sort(
                        Comparator.comparingDouble(Athlete::getAverageResult)
                                .reversed()
                                .thenComparing(Athlete::getName)
                );
                System.out.println("\nОтсортированные спортсмены:");

                for (Athlete athlete : athletes) {
                    System.out.printf(
                            "ID: %d | Имя: %s | Средний результат: %.2f%n",
                            athlete.getId(),
                            athlete.getName(),
                            athlete.getAverageResult()
                    );
                }
            }
}
