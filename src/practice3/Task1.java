package practice3;

public class Task1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 22, 12, 30, 80, 90, 100};

        for (int i = 0; i < a.length; i += 2) {
            System.out.println(a[i]);
        }
    }
}
