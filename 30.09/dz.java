import java.util.Scanner;

public class Main {

    // Написать метод getSquare(int number) который возвращает квадрат числа
    public static int getSquare(int number) {
        return 1;
    }
    // Написать метод sumOddDigits(int number) который возвращает сумму четных цифр числа
    public static int sumOddDigits(int number) {
        return 1;
    }
    // Написать метод max(int a, int b) который возвращает большее из двух чисел a или b
    public static int max(int a, int b) {
        return 1;
    }
    // Написать метод countOfWords(String sentence) => количество слов в строке
    public static int countOfWords(String sentence) {
        return 1;
    }
    
    // Ниже ничего менять не нужно
    
    public static void testGetSquare() {
        int[] testValues = {2, 4, 7, 8, 12, 34, 12};
        int[] validValuesResults = {4, 16, 49, 64, 144, 34 * 34, 144};
        for (int i = 0; i < testValues.length; i++) {
            if (getSquare(testValues[i]) != validValuesResults[i]) {
                System.out.println("Метод getSquare работает не верно!!!");
                return;
            }
        }
        System.out.println("Метод getSquare работает правильно!!!");
    }

    public static void testSumOddDigits() {
        int[] testValues = {2, 4, 123412, 123, 435, 234, 1234};
        int[] validValuesResults = {2, 4, 8, 2, 4, 6, 6};

        for (int i = 0; i < testValues.length; i++) {
            if (sumOddDigits(testValues[i]) != validValuesResults[i]) {
                System.out.println("Метод sumOddDigits работает не верно!!!");
                return;
            }
        }
        System.out.println("Метод sumOddDigits работает правильно!!!");
    }

    public static void main(String[] args) {

        testGetSquare();
        testSumOddDigits();

    }
}
