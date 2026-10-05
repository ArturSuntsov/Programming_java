package practice2;

import java.util.Scanner;

public class Task5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;
            do {
                System.out.println("""
                        1. Выполнить расчет
                        2. Информация о программе
                        3. Информация о разработчике
                        4. Выход
                        """);

                int command = scanner.nextInt();
                switch (command) {
                    case 1 -> {
                        System.out.println("Введите ваш вес в кг:");
                        double weight = scanner.nextDouble();

                        System.out.println("Введите ваш рост в метрах:");
                        double height = scanner.nextDouble();

                        if (weight <= 0 || height <= 0) {
                            System.err.println("Вес и рост должны быть больше нуля");
                            return;
                        }

                        double idx = weight / (height * height);

                        System.out.printf("Ваш индекс массы тела: %.2f\n", idx);
                    }
                    case 2 -> System.out.println("Программа для расчета индекса массы тела");
                    case 3 -> System.out.println("Артур");
                    case 4 -> running = false;
                    default -> System.out.println("Операция не распознана");
                }
            } while (running);

            scanner.close();
        }
    }


