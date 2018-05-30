package second_task;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SecondTask {

    private static int nod(int a, int b) {
        List<Integer> arr = new ArrayList<>();

        if (a > b) {
            arr.add(a);
            arr.add(b);
        } else {
            arr.add(b);
            arr.add(a);
        }

        for (int i = 0; ; i++) {
            int newNum = arr.get(i) % arr.get(i + 1);

            if (newNum != 0) {
                arr.add(newNum);
            } else {
                break;
            }
        }

        return arr.get(arr.size() - 1);
    }

    private static int nok(int a, int b) {
        return (a * b) / nod(a, b);
    }

    public static void print() {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Введите число a: ");
            int a = scan.nextInt();

            System.out.print("Введите число b: ");
            int b = scan.nextInt();

            System.out.println("Сумма: " + (a + b) +
                    "\nРазность: " + (a - b) + "\nНОК: " + nok(a, b) + "\nНОД: " + nod(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не целое число.");
        }
    }

}
