package Exercise2;

/* 
 * Задание 2.
 * 2. Если необходимо, исправьте данный код (задание 2 - https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 *
*/

public class Program {
    public static void main(String[] args) {
        try {
            int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            int d = 1; // Измененное значение переменной d
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArrayIndexOutOfBoundsException e) { // Добавлен обработчик исключения ArrayIndexOutOfBoundsException
            System.out.println("Catching exception: " + e);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
    }
}
