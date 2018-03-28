import java.util.Scanner;

public class Task_6 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = sc.nextLine();
        System.out.print("Исправленный текст: " + text.replaceAll("[0-9]", ""));
    }
}