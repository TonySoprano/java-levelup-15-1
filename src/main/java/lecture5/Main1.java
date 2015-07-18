package main.java.lecture5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//        2. При запуске программы вводить 1й строкой запрос формата "grep _fileName_ _query_"
//        Где:
//            _fileName_      - Имя файла
//            _query_         - Искомое слово.
//        Если команда не grep - предложить ввести команду снова.
//        Если файл не найден - предложить ввести снова.
//        Вывести на экран все строки из файла где найдено искомое слово.
public class Main1 {
    public static String t = null;

    public static void main(String[] args) {
        ZaprosName();
//        System.out.println(t);
        String d = t.substring(0, t.indexOf(" "));
//        System.out.println(d);
        FileName(d, t);
    }

    public static String ZaprosName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите запрос формата grep fileName query");
        String a = scanner.nextLine();
        while (!(a.indexOf("grep") != -1)) {
            if ((a.indexOf("grep") != -1)) {
                break;
            } else {
                System.out.println("Неверный запрос, ведите снова");
                a = scanner.nextLine();
            }
        }
        t = a.substring(5, a.length());
        return t;
    }


    public static void FileName(String d, String t) {
        while (true) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(d));
                String b = t.substring((t.indexOf(" ") + 1), t.length());
//                System.out.println(b);
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.indexOf(b) != -1) System.out.println(line);
                }
                break;

            } catch (FileNotFoundException e) {
                System.out.println("файл не найден");
                ZaprosName();
//                return ZaprosName();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        return null;
    }
}

// grep test cat
// grep test dog
// grep test    - все строки
