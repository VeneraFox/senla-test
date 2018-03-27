import java.util.Scanner;

public class Task_2_2 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число N: ");
        if(sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] fib = new int[]{1, 1, 2};
            System.out.print("1 1");
            if (n > 1)
                while (true) {
                    System.out.print(" " + fib[2]);
                    fib[0] = fib[1];
                    fib[1] = fib[2];
                    fib[2] = fib[0] + fib[1];
                    if (fib[2] >= n)
                        break;
                }
        } else
            System.out.println("Вы ввели не целое число");
    }
}