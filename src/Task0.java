
/**
 * 0.Написать программу со следующим функционалом:
 * На вход передать строку(будем считать, что это номер документа).
 * Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x - это число, а y - это буква.
 * Вывести на экран в одну строку два первых блока по 4 цифры
 * Вывести на экран номер документа, но блоки из трех букв заменить на (каждая буква заменятся на )
 * Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
 * Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
 * (реализовать с помощью класса StringBuilder)
 * Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет
 * (причем, abc и ABC считается одинаковой последовательностью).
 * Проверить начинается ли номер документа с последовательности 555.
 * Проверить заканчивается ли номер документа на последовательность 1a2b.
 * Все эти методы реализовать в отдельном классе в статических методах, которые на вход(входным параметром)
 * будут принимать ввводимую на вход программы строку.
 */


public class Task0 {
    public static void main(String[] args) {
        String docNumber = "4444-Fff-5555-ggg-6d6d";
        //Вывести на экран в одну строку два первых блока по 4 цифры
        printLeters(docNumber);
        //Вывести на экран номер документа, но блоки из трех букв заменить на % (каждая буква заменятся на %)
        printDocNumberWithSymbol(docNumber);
        //Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
        printOnlyLetters(docNumber);
        //Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре (реализовать с помощью класса StringBuilder)
        printOnlyLettersLow(docNumber);
        //Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет
        // *     (причем, abc и ABC считается одинаковой последовательностью).
        checkSymbolSequence(docNumber);
        //Проверить начинается ли номер документа с последовательности 555.
        checkBeginning(docNumber);
        //Проверить заканчивается ли номер документа на последовательность 1a2b.
        checkEnding(docNumber);
    }

    //Вывести на экран в одну строку два первых блока по 4 цифры
    public static void printLeters(String docNumber) {
        String[] StringArray = docNumber.split("-");
        System.out.println(StringArray[0] + StringArray[2]);
    }

    //Вывести на экран номер документа, но блоки из трех букв заменить на % (каждая буква заменятся на %)
    public static void printDocNumberWithSymbol(String docNumber) {
        String[] StringArray = docNumber.split("-");
        System.out.println(StringArray[0] + '-' + StringArray[1].replaceAll("[A-Z a-z]", "%") + '-' + StringArray[2] + '-' + StringArray[3].replaceAll("[A-Z a-z]", "%") + '-' + StringArray[4]);
    }

    //Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
    public static void printOnlyLetters(String docNumber) {
        String[] StringArray = docNumber.split("-");
        System.out.println(StringArray[1].toLowerCase() + '/' + StringArray[3].toLowerCase() + StringArray[4].toLowerCase().replaceAll("[0-9]", "/"));
    }

    //Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре (реализовать с помощью класса StringBuilder)
    public static void printOnlyLettersLow(String docNumber) {
        StringBuilder p = new StringBuilder();

        for (int i = 1; i < docNumber.length(); i++) {
            if (Character.isLetter(docNumber.charAt(i)))
                p.append(docNumber.charAt(i));
        }
        System.out.println(p);
    }

    //Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет
    // *     (причем, abc и ABC считается одинаковой последовательностью).
    public static void checkSymbolSequence(String docNumber) {
        if (docNumber.toLowerCase().contains("abc"))
            System.out.println("Document number contains 'abc' sequence");
        else {
            System.out.println("Document number doesn't contain 'abc' sequence");
        }
    }

    //Проверить начинается ли номер документа с последовательности 555.
    public static void checkBeginning(String docNumber) {
        if (docNumber.startsWith("555"))
            System.out.println("Document number starts with '555' sequence");
        else {
            System.out.println("Document number doesn't start with '555' sequence");
        }
    }

    //Проверить заканчивается ли номер документа на последовательность 1a2b.
    public static void checkEnding(String docNumber) {
        if (docNumber.endsWith("1a2b"))
            System.out.println("Document number ends with '1a2b' sequence");
        else {
            System.out.println("Document number doesn't end with '1a2b' sequence");
        }
    }


}
