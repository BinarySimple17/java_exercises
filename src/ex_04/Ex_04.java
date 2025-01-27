package ex_04;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        new Ex_04().run();
    }

    public void run() {
//    % — остаток от деления

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество секунд: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;          // Часы
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;      // Минуты
        int seconds = remainingSeconds % 60;      // Секунды

        System.out.println(hours + " час " + minutes + " минута " + seconds + " секунда");

    }
}
