package org.itstep.qa.lesson;

public class ZadachaFour {
    //Дана строка, содержащая пробелы. Найдите, сколько в ней слов (слово – это последовательность символов, отличных от пробела).
    // Все слова разделены одним пробелом.
    public static void main(String[] args) {
        String s1 = new String("я люблю эот мир");
        String[] result = s1.split(" ");
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] != " ")
                count++;
        }
            System.out.println(count);
        }
    }




