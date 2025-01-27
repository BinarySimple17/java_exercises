package ex_03;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        new Ex_03().run();
    }

    public void run() {
//    % — остаток от деления

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        int digit1 = number / 100;        // Первая цифра
        int digit2 = (number / 10) % 10;  // Вторая цифра
        int digit3 = number % 10;         // Третья цифра

        int sum = digit1 + digit2 + digit3;
        System.out.println("Сумма цифр: " + sum);

    }
}
