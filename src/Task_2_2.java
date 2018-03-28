import java.util.Scanner;

public class Task_2_2 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите порядковый номер числа из последовательности Фибоначчи, который необходимо найти: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println(fib(n));
        } else
            System.out.print("Вы ввели не целое число");
        }

        static int fib(int n){
            return n > 2 ? fib(n - 1) + fib(n - 2) : 1;
        }
}
