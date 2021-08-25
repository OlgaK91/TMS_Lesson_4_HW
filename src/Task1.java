/**
 * 1. Дана строка произвольной длины с произвольными словами.
 * Найти самое короткое слово в строке и вывести его на экран.
 * Найти самое длинное слово в строке и вывести его на экран.
 * Если таких слов несколько, то вывести последнее из них.
 */

public class Task1 {

    public static void main(String[] args) {
        String fraze = "Корабли ловировали ловировали да не выловировали";
        String[] wordArray = fraze.split(" ");
        int minLength = fraze.length();
        int maxLength = 0;
        String theShortestWord = "";
        String theLongestWord = "";
        for (String s : wordArray) {
            if (s.length() <= minLength) {
                theShortestWord = s;
                minLength = s.length();
            }
            if (s.length() >= maxLength) {
                theLongestWord = s;
                maxLength = s.length();
            }
        }
        System.out.println(theShortestWord);
        System.out.println(theLongestWord);
    }
}
