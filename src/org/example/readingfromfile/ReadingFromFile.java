package org.example.readingfromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        //File.separator - автоматически определит операционную систему и поставит нужный разделитель,
        //(прямой или обратный Слэш) в путь к файлу и присвоит этот Слэш в качестве значения для переменной separator
        String separator = File.separator;

        //Создадим переменную путь до файла применив separator вместо Слэша
        String filePath = separator +"SpringStudy"+ separator +"ReadingFromFile"+ separator +"src"+ separator + "resources" + separator + "Test.txt"; //String filePath = "\\SpringStudy\\ReadingFromFile\\src\\resources\\Test.txt";


        //Создадим объект класса File
        File file = new File(filePath);

        //Создадим объект Scanner для считывания информации из файла
        Scanner scanner = new Scanner(file); //Для считывания из консоли применяется Scanner scanner = new Scanner(System.in);
        //цикл while будет выполняться до тех пор, пока в файле Test.txt ещё есть строки
        //hasNextLine() - возвращает true, если в файле еще есть строки которых мы еще не считывали и false, если таких строк нет
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        //закравает сканнер вызывая метод .close() чтобы поток не оставался открытым
        scanner.close();
    }
}
