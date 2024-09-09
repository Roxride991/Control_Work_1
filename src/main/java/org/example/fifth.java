package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n :");
        int n = sc.nextInt();
        int term = 1 ;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            term = i * i;

            if (term <= n) {
                System.out.println(term);
            }
        }
    }
}
