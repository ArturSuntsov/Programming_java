package practice2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double y = 0.0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                continue;
            }
            y += 1.0 / Math.log(i);

        }

        System.out.print(y);
        scanner.close();
    }
}


