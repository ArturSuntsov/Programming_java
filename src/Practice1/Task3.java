package practice1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int positiveCount = 0;
        int negativeCount = 0;

        if (a > 0) {
            positiveCount++;
        } else if (a < 0) {
            negativeCount++;
        }

        if (b > 0) {
            positiveCount++;
        } else if (b < 0) {
            negativeCount++;
        }

        if (c > 0) {
            positiveCount++;
        } else if (c < 0) {
            negativeCount++;
        }

        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);

        scanner.close();
    }
}
