package first_task;

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

    public static void print(int num) {
        System.out.println(analyze_1(num) + " : " + analyze_2(num));
    }
}
