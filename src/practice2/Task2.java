package practice2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Число должно быть больше нуля.");
            return;
        }

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += Math.pow(a, i);
        }
        System.out.print(sum);
    }
}
