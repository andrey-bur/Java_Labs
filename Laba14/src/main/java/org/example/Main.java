package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Выберите задание от 1 до 5:");
        int a = in.nextInt();
        in.nextLine();

        switch (a) {
            case 1:
                File hobby = new File("hobby.txt");

                try (FileWriter file1 = new FileWriter(hobby)) {
                    file1.write("Мое хобби - заниматься спортом");
                } catch (IOException ex) {
                    System.out.println("Ошибка работы с файлом: " + ex);
                }

                System.out.println("Имя файла: " + hobby.getName());
                System.out.println("Путь к файлу: " + hobby.getAbsolutePath());
                System.out.println("Файл существует: " + hobby.exists());
                System.out.println("Размер файла: " + hobby.length() + " байт");

                try (BufferedReader read =new BufferedReader(new FileReader(hobby))) {
                    String line;
                    while ((line = read.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException ex) {
                    System.out.println("Ошибка чтения файла: " + ex);
                }
                break;

            case 2:
                try (FileWriter f = new FileWriter("f.txt")) {
                    System.out.println("Введите 10 целых чисел:");

                    for (int i = 0; i < 10; i++) {
                        f.write(in.nextInt() + "\n");
                    }
                } catch (IOException ex) {
                    System.out.println("Ошибка работы с файлом: " + ex);
                }

                try (BufferedReader read =
                             new BufferedReader(new FileReader("f.txt"))) {
                    String line;
                    int count = 0;

                    System.out.println("Числа из файла:");

                    while ((line = read.readLine()) != null) {
                        int number = Integer.parseInt(line);
                        System.out.println(number);

                        if (number % 2 == 0) {
                            count++;
                        }
                    }

                    System.out.println("Количество четных чисел: " + count);
                } catch (IOException ex) {
                    System.out.println("Ошибка работы с файлом: " + ex);
                }
                break;

            case 3:
                try (FileWriter f = new FileWriter("f.txt")) {
                    for (int i = 0; i < 10; i++) {
                        int number = (int) (Math.random() * 100);
                        f.write(number + "\n");
                    }
                } catch (IOException ex) {
                    System.out.println("Ошибка записи в файл: " + ex);
                }

                try (BufferedReader read =
                             new BufferedReader(new FileReader("f.txt"));
                     FileWriter h = new FileWriter("h.txt");
                     FileWriter g = new FileWriter("g.txt")) {

                    String line;

                    while ((line = read.readLine()) != null) {
                        int number = Integer.parseInt(line);

                        if (number % 4 == 0) {
                            g.write(number + "\n");
                        } else {
                            h.write(number + "\n");
                        }
                    }

                    System.out.println("Числа, делящиеся на 4, записаны в g.txt");
                    System.out.println("Остальные числа записаны в h.txt");

                } catch (IOException ex) {
                    System.out.println("Ошибка работы с файлами: " + ex);
                }
                break;

            case 4:
                try (FileWriter f = new FileWriter("f.txt")) {
                    System.out.println("Введите 12 значений освещенности:");

                    for (int i = 0; i <5; i++) {
                        double s=in.nextDouble();
                        if(s>=0) {
                            f.write(s + "\n");
                        }
                        else{
                            throw new Exception("не верный формат освещения");
                        }
                    }
                } catch (IOException ex) {
                    System.out.println("Ошибка записи в файл: " + ex);
                }
                catch (Exception ex){
                    System.out.println(ex.getMessage());
                }

                try (BufferedReader read =
                             new BufferedReader(new FileReader("f.txt"))) {
                    String line;
                    double sum = 0;
                    int count = 0;

                    while ((line = read.readLine()) != null) {
                        double value = Double.parseDouble(line);
                        sum += value;
                        count++;
                    }

                    if (count > 0) {
                        System.out.println(
                                "Средняя освещенность: " + sum / count);
                    }
                } catch (IOException ex) {
                    System.out.println("Ошибка чтения файла: " + ex);
                }
                break;

            case 5:
                try (FileWriter f = new FileWriter("f.txt")) {
                    for (int i = 0; i < 10; i++) {
                        int number = (int) (Math.random() * 100);
                        f.write(number + "\n");
                    }
                } catch (IOException ex) {
                    System.out.println("Ошибка записи в файл: " + ex);
                }

                try (BufferedReader read =
                             new BufferedReader(new FileReader("f.txt"))) {
                    String line;
                    int count = 0;

                    System.out.println("Числа из файла:");

                    while ((line = read.readLine()) != null) {
                        int number = Integer.parseInt(line);
                        System.out.println(number);

                        if (number % 2 != 0) {
                            count++;
                        }
                    }

                    System.out.println("Количество нечетных чисел: " + count);
                } catch (IOException ex) {
                    System.out.println("Ошибка чтения файла: " + ex);
                }
                break;

            default:
                System.out.println("Неправильно выбрано задание");
        }

        in.close();
    }
}
