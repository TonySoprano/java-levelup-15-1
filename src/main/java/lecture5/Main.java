package main.java.lecture5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла");
        String a = scanner.nextLine();
        while (!a.equals("test")) {
            if (a.equals("test")) {
                break;
            } else {
                System.out.println("Введите снова");
                a = scanner.nextLine();
            }
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            System.out.println("Введите искомое слово");
            String b = scanner.nextLine();
            String line;
            while ((line = br.readLine()) != null) {
                if (line.indexOf(b) != -1) System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
