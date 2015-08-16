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
    public void comand(String t) throws IOException {
//        System.out.println("Удаление = " + t);
        File file = new File(t);
        if(file.isDirectory()){
            file.delete();
            if(file.isDirectory()){
//                System.out.printf("Удаление непустой директории %s не поддерживается",t);
                System.out.printf("Директория %s :\n", t);
                for (String i : file.list()) {
                    System.out.println(i);
                }
                System.out.printf("Удаление непустой директории %s! нажмите Y (если ДА) или любую клавишу (если НЕТ)\n",t);
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String f = reader.readLine();
                if(f.equals("ДА")){
                    delFile(file);
                    System.out.printf("Директория %s удалена", t);
                } else System.out.printf("Директория %s неудалена", t);
            }else {
                System.out.printf("Директория %s удалена", t);
            }
        }else if(file.exists()){
            file.delete();
                 System.out.printf("Файл %s удален",t);
             } else System.out.printf("Директории/файла %s не существует",t);
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
