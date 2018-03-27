import java.util.Scanner;

public class Task_3_1 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты отрезков через пробел (x11 y11 x12 y12 x21 y21 x22 y22):");
        String input = sc.nextLine();
        String[] stLines = input.split(" ");
        double x11 = Double.parseDouble(stLines[0]);
        double y11 = Double.parseDouble(stLines[1]);
        double x12 = Double.parseDouble(stLines[2]);
        double y12 = Double.parseDouble(stLines[3]);
        double x21 = Double.parseDouble(stLines[4]);
        double y21 = Double.parseDouble(stLines[5]);
        double x22 = Double.parseDouble(stLines[6]);
        double y22 = Double.parseDouble(stLines[7]);
        if (crossing(x11, x12, x21, x22) && crossing(y11, y12, y21, y22)
                && triangle(x11, y11, x12, y12, x21, y21) * triangle(x11, y11, x12, y12, x22, y22) <= 0
                && triangle(x21, y21, x22, y22, x11, y11) * triangle(x21, y21, x22, y22, x12, y12) <= 0)
            System.out.println("Отрезки пересекаются");
        else
            System.out.println("Отрезки не пересекаются");
    }

    static double triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        return (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1);
    }

    static boolean crossing(double a, double b, double c, double d) {
        if (a > b) a = a + b -(b = a);
        if (c > d) c = c + d -(d = c);
        return Math.max(a, c) <= Math.min(b, d);
    }
}