package ex_05;

import java.util.Scanner;

public class Ex_05 {

    /**
     * Выводить на экран "Не угадал!" до тех пор,
     * пока с клавиатуры не будет введено число 1.
     * Запрашивать число с клавиатуры перед выводом на экран "Не угадал!"
     * типы циклов: while{..}, do{..} while(), for(){..}
     */

    public static void main(String[] args) {
        new Ex_05().run();
    }

    public void run() {

        Scanner scanner = new Scanner(System.in);

        while (scanner.nextInt() != 1) {//Перед каждым выводом фразы будет запрашиваться число
            System.out.println("Не угадал!");
        }

//        Сначала фраза в первый раз, а лишь потом начнем запрашивать число
        do {
            System.out.println("Не угадал!");
        } while (scanner.nextInt() != 1);

//          Перед каждым выводом фразы будет запрашиваться число
        for (; true; ) {
            if (scanner.nextInt() == 1)
            {
                break;
            }
            System.out.println("Не угадал!");
        }

        scanner.close();        // close scanner and System.in stream

    }
}
