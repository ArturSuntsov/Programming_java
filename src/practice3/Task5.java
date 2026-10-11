package practice3;

import java.util.Scanner;

public class Task5 {
    static double[] params = new double[3];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
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
                    input();
                    if (check()) {
                        calculate();
                        output();
                    } else {
                        System.err.println("Вес и рост должны быть больше нуля");
                    }
                }
                case 2 -> System.out.println("Программа для расчета индекса массы тела");
                case 3 -> System.out.println("Артур");
                case 4 -> running = false;
                default -> System.out.println("Операция не распознана");
            }
        } while (running);

        scanner.close();
    }

    static void input() {
        System.out.println("Введите ваш вес в кг:");
        params[0] = scanner.nextDouble();

        System.out.println("Введите ваш рост в метрах:");
        params[1] = scanner.nextDouble();
    }

    static boolean check() {
        return params[0] > 0 && params[1] > 0;
    }

    static void calculate() {
        params[2] = params[0] / (params[1] * params[1]);
    }

    static void output() {
        System.out.printf("Ваш индекс массы тела: %.2f\n", params[2]);
    }
}