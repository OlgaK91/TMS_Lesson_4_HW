/**
 * 2. Дана строка произвольной длины с произвольными словами.
 * Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры.
 * Если таких слов несколько, найти первое из них.
 * Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 */

public class Task2 {
    public static void main(String[] args) {

        String fraze = "fffff ab f 1234 jkjk";
        String[] wordArray = fraze.split(" ");
        int minNumberOfUnicSymbols = fraze.length();
        String foundWord = "";
        for (String s : wordArray) {
            if (getUnicSymbols(s) < minNumberOfUnicSymbols) {
                minNumberOfUnicSymbols = getUnicSymbols(s);
                foundWord = s;
            }
        }
        System.out.println(foundWord);
    }

    public static int getUnicSymbols(String word) {
        String p = "";
        if (word.length() == 1) {
            return 1;
        } else {
            for (int i = 1; i < word.length(); i++) {
                if (!p.contains(word.substring(i, i + 1))) {
                    p = p + word.substring(i, i + 1);
                }
            }
            return p.length();
        }
    }
}
