package org.example.readingfromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile2 {
    public static void main(String[] args) throws FileNotFoundException {
        //File.separator - автоматически определит операционную систему и поставит нужный разделитель,
        //(прямой или обратный Слэш) в путь к файлу и присвоит этот Слэш в качестве значения для переменной separator
        String separator = File.separator;

        //Создадим переменную путь до файла применив separator вместо Слэша
        String filePath = separator +"SpringStudy"+ separator +"ReadingFromFile"+ separator +"src"+ separator + "resources" + separator + "Test2.txt"; //String filePath = "\\SpringStudy\\ReadingFromFile\\src\\resources\\Test2.txt";


        //Создадим объект класса File
        File file = new File(filePath);

        //Создадим объект Scanner для считывания информации из файла
        Scanner scanner = new Scanner(file); //Для считывания из консоли применяется Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        //метод .split(" ") разделяет строку на слова символом указанным в аргументах, в нашем случае это пробел
        String[] words = line.split(" ");

        System.out.println(Arrays.toString(words));

        scanner.close();

    }
}
