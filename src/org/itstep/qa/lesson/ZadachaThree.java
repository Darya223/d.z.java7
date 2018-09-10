package org.itstep.qa.lesson;

public class ZadachaThree {
    //Даны две строки. Определите, является ли первая строка подстрокой второй строки. (Можно использовать метод contains).
    public static void main(String[] args) {
        String s1 = "мир";
        String s2 = "привет, мир!";
        if (s2.contains(s1))
            System.out.println("первая строка является подстрокой второй строки");
            else
            System.out.println("не является ");
        }
    }


