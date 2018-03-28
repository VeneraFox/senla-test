import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество итераций: ");
        if(sc.hasNextInt()) {
            int n = sc.nextInt() - 2;
            int a = 1;
            int b = 1;
            System.out.print(a + " " + b);
            for(int i = 0; i < n; i++){
                int sum = a + b;
                a = b;
                b = sum;
                System.out.print(" " + sum);
            }
        } else
            System.out.print("Вы ввели не целое число");
    }
}

