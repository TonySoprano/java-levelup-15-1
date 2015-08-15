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
    public void comand(String t) {
//        System.out.println("Отображение = " + s);
        File file = new File(t);
        if(file.isDirectory()){
                System.out.printf("Директория %s :\n", t);
                for (String i : file.list()) {
                    System.out.println(i);
                }
        }else if(file.exists()){
            System.out.printf("Команда %s неверна, работает только для директорий",t);
        } else System.out.printf("Директории/файла %s не существует",t);
    }
}

