package ex_02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        new Ex_02().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Площадь круга: " + area);
    }


}
