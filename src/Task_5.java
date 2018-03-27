import java.util.Scanner;

public class Task_5 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String wd = sc.nextLine();
        char[] letter = wd.toCharArray();
        for (int i = 0; i < letter.length / 2; i++) {
            if (letter[i] != letter[letter.length - 1 - i]){
                System.out.println("Это не палиндром");
                return;
            }
        }
        System.out.println("Это палиндром!");
    }
}