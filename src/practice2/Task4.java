package practice2;

public class Task4 {
    public static void main(String[] args) {
        calculation(5);
    }

    public static void calculation(double num) {
        if (num <= 0) {
            System.out.println("Число должно быть больше нуля");
            return;
        }

        double perimeter = 3 * num;

        double area = (Math.sqrt(3) / 4) * Math.pow(num, 2);

        System.out.printf("Периметр: %.2f%n", perimeter);
        System.out.printf("Площадь: %.2f%n", area);
    }
}
