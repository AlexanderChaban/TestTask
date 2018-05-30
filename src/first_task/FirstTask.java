package first_task;

import java.util.Scanner;

public class FirstTask {

    private static String analyze_1(int num) {
        if (num % 2 == 0) {
            return "Четное";
        } else {
            return "Нечетное";
        }
    }

    private static String analyze_2(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count > 2) {
            return "составное";
        } else {
            return "простое";
        }
    }

    public static void print() {
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        String num = scan.next();

        try {
            System.out.println(analyze_1(Integer.parseInt(num)) + " : " + analyze_2(Integer.parseInt(num)));
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не целое число.");
        }
    }
}
