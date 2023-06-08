package Exercise4;

import java.util.Scanner;

/* 
 * Задание 4.
 * 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 *
*/


public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите текст: ");
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    throw new Exception("Вы ввели пустую строку! Повторите ввод.");
                }
                System.out.println("Вы ввели: " + input);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
