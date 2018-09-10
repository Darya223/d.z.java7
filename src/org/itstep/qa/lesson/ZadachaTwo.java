package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaTwo {
    //Создать строку и проинициализировать ее каким-либо значением. Вывести значение строки на экран.
    // Присвоить этой же строке значение, введенное с клавиатуры и также вывести его на экран.
    public static void main(String[] args) {
        String s1 = "привет";
        System.out.println(s1);
        Scanner scanner = new Scanner(System.in);
        s1 = scanner.nextLine();
        System.out.println(s1);
    }
}
