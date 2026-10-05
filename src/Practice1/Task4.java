package practice1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа для расчета индекса массы тела");

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

        scanner.close();
    }
}
