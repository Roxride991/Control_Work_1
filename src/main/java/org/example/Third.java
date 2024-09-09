package org.example;
import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите N: ");
        int n = sc.nextInt();
        double sum = 1;
        double term = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            term = (double) 1 / (1 * factorial);
            sum += term;
            factorial *= i+1;
        }
        System.out.println("Сумма = " + sum);


    }
}