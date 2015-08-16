package main.java.lecture13;
// 2.
//        > Шаблон      ls $url
//        > Примеры    ls C://dirName
//        Если передали файл - вывести пользователю команда работает только с папками. Если не найдено
//        - вывести что не найдено. Если директория - вывести на экран все содержимое папки.. Пример вывода:
//        dir1      1.2m
//        dir2      1.56k
//        ads.txt  3.6g

import java.io.File;

public class Ls implements Comand {
    @Override
    public boolean check(String t) {
        if (t.equals("ls")) {
            return true;
        }
        return false;
    }

    @Override
    public String comand(String t) {
//        System.out.println("Отображение = " + s);
        String[] s = t.split(" ");
        t = s[1];
        File file = new File(t);
        String r = "";
        if (file.isDirectory()) {
            for (String i : file.list()) {
                r += i + "\n";
            }
            return r;
        } else if (file.exists()) {
            return String.format("Команда %s неверна, работает только для директорий", t);
        } else return String.format("Директории/файла %s не существует", t);
    }
}

