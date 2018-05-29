import first_task.FirstTask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        String num = scan.next();

        try {
            FirstTask.print(Integer.parseInt(num));
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не целое число.");
        }
    }
}
