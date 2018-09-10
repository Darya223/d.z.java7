package org.itstep.qa.lesson;

public class ZadachaFive {
    //Изменить регистр введенного символа, если он был латинской буквой.
    public static void main(String[] args) {
        Character ch = new Character('u');

        if
        (Character.isLetter(ch))
        if (ch >= ((char) 65) && ch <= ((char) 90) || ch >= ((char) 97) && ch <= ((char) 122))
                System.out.println("Это буква латинского алфавита");
            if (Character.isLowerCase(ch))
                System.out.println(Character.toUpperCase(ch));

            else if (Character.isUpperCase(ch))
                System.out.println(Character.toLowerCase(ch));
            else
                System.out.println("Это цифра, либо не латинская буква");

        }
    }



















