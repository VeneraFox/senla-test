import java.util.Scanner;

public class Task_1 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if(sc.hasNextInt()) {
            int n = sc.nextInt();
            for(int i = 2; i <= n; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= (i/j); j++)
                    if ((i % j) == 0) isPrime = false;
                if (isPrime)
                    System.out.println(i + " - простое число");
            }
        } else
            System.out.print("Вы ввели не целое число");
    }
}