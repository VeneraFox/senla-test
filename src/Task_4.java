import java.util.Scanner;

public class Task_4 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        System.out.println("НОД: " + nod(a,b));
        System.out.println("НОК: " + nok(a,b));
    }

    static int nod(int a,int b){
        return b == 0 ? a : nod(b,a % b);
    }

    static int nok(int a,int b){
        return a / nod(a,b) * b;
    }
}