package main.java.lecture13;
//1.        > Шаблон      rm $url
//        > Примеры    rm C://dirName     |     rm C://dir1/dir2/file.txt
//        > Если запрос на удаление директории и она не пустая - вернуть текст с тем что удаление не пустых директорий не
//        поддердивается (Плюсом будет удалить и не пустую, тобиш пройтись рекурсией по всему содержимому и удалить все
//        начиная с самого верха и заканчивая переданной директорией). Если переданный файл не найден - вывести что файл
//        не найден. Если метод на удаление вернул true - вывести что файл\папка успешно удаленны
// 2.
//        > Шаблон      ls $url
//        > Примеры    ls C://dirName
//        > Если передали файл - вывести пользователю команда работает только с папками. Если не найдено - вывести что не
//        найдено. Если директория - вывести на экран все содержимое папки.. Пример вывода:
//        dir1      1.2m
//        dir2      1.56k
//        ads.txt  3.6g
// 3.
//        > Шаблон      mv $url-from $url-to
//        > Примеры    rm C://dir1/ss.txt D://dir3/dir2/ssss.txt
//        > Если $url-from указывает на не файл - вывести что команда работает только с файлами, если $url-from не найден
//        - вывести что файл для переноса не найден, если $url-to существует - вывести что файл куда надо переносить уже
//        существует. Необходимо открыть поток на чтение на $url-from, создать файл по $url-to, и открыть на него поток
//        на запись, перенести все содержимое, закрыть потоки, удалить файл $url-from, вывести на экран что файл успешно
//        перенесен

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

//    public static Comand<String> container = new Comand<String>();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите запрос: ");
        String number = reader.readLine();
        String[] s = number.split(" ");
        System.out.println(s[0]);
        if(s[0].equals("rm")) {
            Rm rm = new Rm();
            new Main().comand(rm, s[0], s[1]);
        }else if(s[0].equals("ls")){
            Ls ls = new Ls();
            new Main().comand(ls, s[0], s[1]);
        }else if(s[0].equals("mv")) {
            Mv mv = new Mv();
            new Main().comand(mv, s[0], s[1]);
        }else System.out.println("Неверная команда");
        //        System.out.println(s[1]);
        File file = new File(s[1]);

    }
    public void comand(Comand com, String s, String t) {
        com.comand(s, t);
    };

}


//
//        System.out.println("Exists: " + file.exists()); // Проверка на наличие файла\директории.
//        System.out.println("Is dir: " + file.isDirectory()); // Проверка на то директория ли это
//        System.out.println("Canonical path: " + file.getPath());
//        System.out.println("Absolute path: " + file.getAbsolutePath());
//        System.out.println("Parent dir: " + file.getParent());
//        System.out.println("Can write: " + file.canWrite());
//        System.out.println("Can read: " + file.canRead());
//        System.out.println("Can execute: " + file.canExecute());
//        System.out.println("Last modified: " + new Date(file.lastModified()));
//        System.out.println("List: " + Arrays.toString(file.list()));
//        ioTest1(file);
//        ioTest2(file);
//        rwTest1(file);
//        rwTest2(file);
//    }
//
//    private static void ioTest1(File file) throws IOException {
//        InputStream is = new FileInputStream(file);
//        OutputStream os = new FileOutputStream("out-test.txt", true);
//        int b;
//        while((b = is.read()) != -1) {
//            os.write(b);
//        }
//        is.close();
//        os.flush();
//        os.close();
//    }
//
//    private static void ioTest2(File file) throws IOException {
//        InputStream is = new BufferedInputStream(new FileInputStream(file));
//        OutputStream os = new BufferedOutputStream(new FileOutputStream("out-test.txt", true));
//        int b;
//        while((b = is.read()) != -1) {
//            os.write(b);
//        }
//        is.close();
//        os.flush();
//        os.close();
//    }
//
//    private static void rwTest1(File file) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader(file));
//        PrintWriter writer = new PrintWriter("out-test.txt");
//        String b;
//        while ((b = reader.readLine()) != null) {
//            writer.printf("line: %s\n", b);
//        }
//        reader.close();
//        writer.flush();
//        writer.close();
//    }
//
//    private static void rwTest2(File file) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String b;
//        while (!(b = reader.readLine()).equals("exit")) {
//            System.out.println("your line: " + b);
//        }
//    }
//
//
//}
//
//
////        for (int i = 0; i < 10; i++) {
////            System.out.println(i +" "+ container.getMass(i));
////        }
////        container.delMass();
////
////        System.out.println();
////        for (int j = 0; j < 10; j++) {
////            System.out.println(j +" "+ container.getMass(j));
////        }
//    }