import java.util.Scanner;

/**
 *   3. Дана строка произвольной длины с произвольными словами.
 *   Написать программу для проверки является ли любое выюранное слово в строке полиндромом.
 *   Например, есть строка, вводится число 3, значит необходимо проверить является ли 3ей слово в этой строке полиндромом.
 *   Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций:
 *   например, в строке 5 слов, а на вход программе передали число 500 и т.п. ситуации.
 */
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String fraze = "saippuakivikauppias sdkjfhsk";
        System.out.println("Enter the number of word");
        Scanner scanner = new Scanner(System.in);
        int wordNumber = scanner.nextInt();
        scanner.close();
        if (wordNumber > fraze.length() || wordNumber < 1) {
            System.out.println("Entered number is invalid");
        } else {
            String[] wordArray = fraze.split(" ");
            String ourWord = wordArray[wordNumber - 1];
            String p = new StringBuilder(ourWord).reverse().toString();
            if (ourWord.equals(p)) {
                System.out.println("Word " + ourWord + " is a palindrome");
            } else {
                System.out.println("Word " + ourWord + " isn't a palindrome");
            }
        }
    }
}
