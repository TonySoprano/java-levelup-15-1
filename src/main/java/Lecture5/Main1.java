package Lecture5;

/**
 * Created by Artem on 09.07.2015.
 */

//        1. При запуске программы вводить следующие данные
//              1. Имя файла
//              2. Искомое слово.
//        Если файл не найден - предложить ввести снова.
//        Вывести на экран все строки из файла где найдено искомое слово.

//        2. При запуске программы вводить 1й строкой запрос формата "grep _fileName_ _query_"
//        Где:
//            _fileName_      - Имя файла
//            _query_         - Искомое слово.
//        Если команда не grep - предложить ввести команду снова.
//        Если файл не найден - предложить ввести снова.
//        Вывести на экран все строки из файла где найдено искомое слово.
public class Main1 {
    public static void main(String[] args) {
        new FileInput1().enterFile();
    }
}