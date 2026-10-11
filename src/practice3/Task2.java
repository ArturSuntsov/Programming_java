package practice3;

public class Task2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 22, 12, 30, 80, 90, 100};
        int increasingSum = 0;

        try {
            for (int i = 0; i < a.length; i++) {
                if (a[i] <= a[i + 1]) {
                    continue;
                } else {
                    increasingSum += 1;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            increasingSum += 1;
        }
        System.out.print(increasingSum);
    }
}
