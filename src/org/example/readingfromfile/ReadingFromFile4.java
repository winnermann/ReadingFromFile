package org.example.readingfromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile4 {
    public static void main(String[] args) throws FileNotFoundException {

        //Создадим переменную путь до файла
        //что бы не указывать весь путь, нужно положить файл в папку с проектом ReadingFromFile, тогда можно указать только имя файла Test4.txt
        String filePath = "Test4.txt"; //String filePath = "D:\SpringStudy\ReadingFromFile\Test4.txt";

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
