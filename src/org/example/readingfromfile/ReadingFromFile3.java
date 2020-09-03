package org.example.readingfromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile3 {
    public static void main(String[] args) throws FileNotFoundException {
        //File.separator - автоматически определит операционную систему и поставит нужный разделитель,
        //(прямой или обратный Слэш) в путь к файлу и присвоит этот Слэш в качестве значения для переменной separator
        String separator = File.separator;

        //Создадим переменную путь до файла применив separator вместо Слэша
        String filePath = separator +"SpringStudy"+ separator +"ReadingFromFile"+ separator +"src"+ separator + "resources" + separator + "Test3.txt"; //String filePath = "\\SpringStudy\\ReadingFromFile\\src\\resources\\Test2.txt";


        //Создадим объект класса File
        File file = new File(filePath);

        //Создадим объект Scanner для считывания информации из файла
        Scanner scanner = new Scanner(file); //Для считывания из консоли применяется Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        //метод .split(" ") разделяет строку на слова символом указанным в аргументах, в нашем случае это ноль
        String[] numbersString = line.split("0");

        //создадим массив чисел, в котором будет три числа
        int[] numbers = new int[3];
        //текущий индекс равен нулю 0
        int counter = 0;

        //создадим цикл for...each для каждого числа number в массиве чисел numbers

        for (String number : numbersString){
            //метод .parseInt() принимает на вход строку number и эту строку он преобразует в число
            //в массиве numbers будут храниться переменные типа int
            numbers[counter++] = Integer.parseInt(number);

        }

        System.out.println(Arrays.toString(numbers));

        scanner.close();

    }
}
