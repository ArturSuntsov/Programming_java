package practice3;

public class Task3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 22, 12, 30, 80, 90, 100};

        System.out.println(arithmeticMean(a));
    }


    public static double arithmeticMean(int[] a) {
        double sumArr = 0.0;

        for (int i : a) {
            sumArr += i;
        }

        double b = sumArr / a.length;

        return b;
    }
}
