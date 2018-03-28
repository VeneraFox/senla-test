import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты отрезков через пробел (x11 y11 x12 y12 x21 y21 x22 y22)");
        String input = sc.nextLine();
        String[] stLines = input.split(" ");
        int x11 = Integer.parseInt(stLines[0]);
        int y11 = Integer.parseInt(stLines[1]);
        int x12 = Integer.parseInt(stLines[2]);
        int y12 = Integer.parseInt(stLines[3]);
        int x21 = Integer.parseInt(stLines[4]);
        int y21 = Integer.parseInt(stLines[5]);
        int x22 = Integer.parseInt(stLines[6]);
        int y22 = Integer.parseInt(stLines[7]);
        if (crossing(x11, x12, x21, x22) && crossing(y11, y12, y21, y22)
                && triangle(x11, y11, x12, y12, x21, y21) * triangle(x11, y11, x12, y12, x22, y22) <= 0
                && triangle(x21, y21, x22, y22, x11, y11) * triangle(x21, y21, x22, y22, x12, y12) <= 0)
                System.out.println("Отрезки пересекаются");
        else
            System.out.println("Отрезки не пересекаются");
    }

    static int triangle(int x1, int y1, int x2, int y2, int x3, int y3){
        return (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1);
    }

    static boolean crossing(int a, int b, int c, int d) {
        if (a > b) a = a + b -(b = a);
        if (c > d) c = c + d -(d = c);
        return Math.max(a, c) <= Math.min(b, d);
    }
}