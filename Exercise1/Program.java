package Exercise1;

import java.util.Scanner;

/* 
 * Задание 1.
 * 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 *
*/

public class Program {
    public static void main(String[] args) {
        float number = readFloatFromConsole();
        System.out.println("Вы ввели число: " + number);
    }

    public static float readFloatFromConsole() {
        Scanner scanner = new Scanner(System.in);
        float number;

        while (true) {
            System.out.print("Введите дробное число: ");

            try {
                number = Float.parseFloat(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено неверное значение. Пожалуйста, попробуйте еще раз.\n");
            }
        }
        return number;
    }
}