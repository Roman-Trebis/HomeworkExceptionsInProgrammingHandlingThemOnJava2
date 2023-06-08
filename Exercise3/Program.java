package Exercise3;

/* 
 * Задание 3.
 * 3. Если необходимо, исправьте данный код (задание 3 - https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 *
*/

public class Program {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Ошибка деления на ноль: " + ex.getMessage());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера: " + ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так: " + ex.getMessage());
        }
    }
    
    public static void printSum(Integer a, Integer b) {
        try {
            if (a == null || b == null) {
                throw new NullPointerException("Один из аргументов равен null");
            }
            System.out.println(a + b);
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null: " + ex.getMessage());
        }
    }
}
