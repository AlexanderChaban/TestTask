import first_task.FirstTask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите № задачи: ");
        Scanner scan = new Scanner(System.in);
        String choice = scan.next();

        switch (choice) {
            case "1": {
                FirstTask.print();
                break;
            }
            default: {
                System.out.println("Задача отсутствует");
                break;
            }
        }
    }
}
