package main.java.lecture11;
//Ќаписать контейнер, в котором значени€ будут хранитс€ в массиве.
// ” контейнера должен быть функционал - добавление, получение по индексу, очистка.
//         онтейнер должен быть обобщенным (generic).
//        –азмер массива изначально развен 10; ѕри заполени массива расширить его в 2 раза,
// и перенести все содержимое из старого массива в новый.
//        ƒобавить метод дл€ удалени€ элемента по индексу с сдвигом всех последующих значений.
public class Main {
    public static Container arr = new Container();
    public static void main(String[] args) {
        arr.add(1);
        arr.add(1.2);
        arr.add("asdasd");
        arr.add("asdasd");
        arr.add("asdasd");
        arr.add("asdasd");
        arr.add("asdasd");
        arr.add("asdasd");
        arr.add(new Object());
        Object user = (Object) arr.get(3);
        for (int i = 0; i < 10; i++) {
            System.out.println(i +" "+ arr.get(i));
        }
        arr.del();
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(i +" "+ arr.get(i));
        }
    }
}
