package main.java.lecture13;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

//1.        > Шаблон      rm $url
//        > Примеры    rm C://dirName     |     rm C://dir1/dir2/file.txt
//        > Если запрос на удаление директории и она не пустая - вернуть текст с тем что удаление не пустых директорий не
//        поддердивается (Плюсом будет удалить и не пустую, тобиш пройтись рекурсией по всему содержимому и удалить все
//        начиная с самого верха и заканчивая переданной директорией). Если переданный файл не найден - вывести что файл
//        не найден. Если метод на удаление вернул true - вывести что файл\папка успешно удаленны
public class TRm implements Comand {
    @Override
    public boolean check(String t) {
        if (t.equals("rm")) {
            return true;
        }
        return false;
    }

    @Override
    public String comand(String t) throws IOException {
//        System.out.println("Удаление = " + t);
        String[] s = t.split(" ");
        t = s[1];
        File file = new File(t);
        if (file.isDirectory()) {
            delFile(file);
            return String.format("Директория %s удалена", t);

        } else if (file.exists()) {
            file.delete();
            return String.format("Файл %s удален", t);
        } else return String.format("Директории/файла %s не существует", t);
    }

    public void delFile(File dir) throws IOException {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory())
                    delFile(file);
            }
            for (File file : files) {
                if (file.isFile()) {
                    file.delete();
                }
            }
            dir.delete();
        }
    }
}
