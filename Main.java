

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x (|x| < 1): ");
        double x = scanner.nextDouble();
        System.out.print("Введите предел суммирования n: ");
        int limit = scanner.nextInt();
        double sum = x;
        if (Math.abs(x) <= 1)
        {
            for (int n = 1; n <= limit; n++) {
                int numerator = 1;
                for (int k = 1; k <= n; k++) {
                    numerator *= (2 * k - 1);
                }
                int denominator = 1;
                for (int k = 1; k <= n; k++) {
                    denominator *= (2 * k);
                }
                denominator *= (2 * n + 1);
                double term =(double) numerator / denominator * Math.pow(x, 2 * n + 1);
                sum += term;
            }
        }
        else System.out.println("Значение x должно быть в пределах |x| < 1.");
        System.out.printf("Сумма ряда " + sum);
    }
}