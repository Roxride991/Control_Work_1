package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите N :");
        int n = sc.nextInt();
        int otvet = 0;
        while (n > 0) {
            if (n % 10 == 0) {
                otvet ++;
            }
            n /= 10;
        }
        System.out.println("Ответ : " + otvet);
    }
}
