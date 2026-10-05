package practice2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean flag = false;

        if (n <= 0) {
            System.out.println("Число должно быть больше нуля.");
            return;
        }

        while (n > 0) {
            if (n % 10 == 2) {
                flag = true;
                break;
            }
            n /= 10;
        }
        if (flag) {
            System.out.println("True");
        } else {
            System.out.println(("False"));
        }
        scanner.close();
    }
}
