import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class Task_2_1 {
    private static ArrayList<Integer> f = new ArrayList<Integer>();
    public static long F(int N){
        if (N < f.size()) return f.get(N);
            if(N == 0) {
                f.add(0);
                return 0;
            }
            if(N == 1){
                f.add(1);
                return 1;
            }
        long v = F(N-2) + F(N-1);
        f.add((int)v);
        return v;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество итераций: ");
        if(sc.hasNextInt()) {
            int M = sc.nextInt();
            for (int N = 0; N < M; N++)
                System.out.println(" "+F(N));
            }
        else
            System.out.println("Вы ввели не целое число");
    }
}
