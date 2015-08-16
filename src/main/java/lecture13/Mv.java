package main.java.lecture13;
// 3.
//        > Шаблон      mv $url-from $url-to
//        > Примеры    rm C://dir1/ss.txt D://dir3/dir2/ssss.txt
//        > Если $url-from указывает на не файл - вывести что команда работает только с файлами, если $url-from не найден
//        - вывести что файл для переноса не найден, если $url-to существует - вывести что файл куда надо переносить уже
//        существует. Необходимо открыть поток на чтение на $url-from, создать файл по $url-to, и открыть на него поток
//        на запись, перенести все содержимое, закрыть потоки, удалить файл $url-from, вывести на экран что файл успешно
//        перенесен

import java.io.*;

public class Mv implements Comand {
    @Override
    public boolean check(String t) {
        if (t.equals("mv")) {
            return true;
        }
        return false;
    }

    @Override
    public String comand(String t) throws IOException {
//        System.out.println("Перенос = " + t);
        String[] s = t.split(" ");
        File file = new File(s[1]);
        File file1 = new File(s[2]);
        if (file.isDirectory() || file1.isDirectory()) {
            return String.format("%s - неверно, команда работает только с файлами", t);
        } else if (file.exists() && !file1.exists()) {
            mvTest(file, file1);
            file.delete();
            return String.format("Файл %s перенесен в %s.\nФайл %s удален.", s[1], s[2], s[1]);
        } else if (file1.exists()) {
            return String.format("Файл %s уже существует", s[2]);
        } else return String.format("Файла %s для переноса не существует", s[1]);
    }


    private static void mvTest(File file, File file1) throws IOException {
        InputStream is = new FileInputStream(file);
        OutputStream os = new FileOutputStream(file1, true);
        int b;
        while ((b = is.read()) != -1) {
            os.write(b);
        }
        is.close();
        os.flush();
        os.close();
    }
}

