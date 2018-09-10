package org.itstep.qa.lesson;

public class ZadachaOne {
    //Проверить, является ли введенный символ цифрой.
    public static void main(String[] args) {
        Character ch = new Character('d');
        System.out.println(Character.isDigit(ch));
    }
}
