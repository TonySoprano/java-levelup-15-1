package main.java.lecture13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
//    public static Comand<String> container = new Comand<String>();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите запрос: ");
        String number = reader.readLine();
        String[] s = number.split(" ");
//        System.out.println(s[0]);


//        if (s[0].equals("rm")) {
//            TRm TRm = new TRm();
//            new Main().comand(TRm, s[1]);
//        } else if (s[0].equals("ls")) {
//            Ls ls = new Ls();
//            new Main().comand(ls, s[1]);
//        } else if (s[0].equals("mv")) {
//            Mv mv = new Mv();
//            new Main().comand(mv, s[1], s[2]);
//        } else System.out.println("Неверная команда");
        //        System.out.println(s[1]);
    }

    public void comand(Comand com, String t) throws IOException {
        com.comand(t);
    }

    public void comand(Comand com, String t, String t1) throws IOException {
        String t2 = t + " " + t1;
        com.comand(t2);
    }

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

