package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = sc.nextInt();
        double sum = 0;
        double term = 0;
        for (int i = 1; i <= n; i++) {
            term = 1/Math.pow(i,2);
            sum += term;
        }
        System.out.println("Сумма  = "+sum);
        }
    }
