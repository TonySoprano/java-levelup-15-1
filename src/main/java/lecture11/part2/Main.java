package main.java.lecture11.part2;

//Ќаписать контейнер, в котором значени€ будут хранитс€ в массиве.
// ” контейнера должен быть функционал - добавление, получение по индексу, очистка.
//         онтейнер должен быть обобщенным (generic).
//        –азмер массива изначально развен 10; ѕри заполени массива расширить его в 2 раза,
// и перенести все содержимое из старого массива в новый.
//        ƒобавить метод дл€ удалени€ элемента по индексу с сдвигом всех последующих значений.
public class Main {
    public static GoodContainer<String> container1 = new GoodContainer<String>();
    public static GoodContainer<Integer> container2 = new GoodContainer<Integer>();
    public static void main(String[] args) {
        container1.addMass("one0");
        container1.addMass("one1");
        container1.addMass("one2");
        container1.addMass("one3");
        container1.addMass("one4");
        container1.addMass("one5");
        container1.addMass("one6");
        container1.addMass("one7");
        container1.addMass("one8");
        container1.addMass("one9");
//        container1.addMass("one10");
        container2.addMass(1);
        container2.addMass(2);
        container2.addMass(3);
        container2.addMass(4);
        container2.addMass(5);
        container2.addMass(6);
        container2.addMass(7);


        for (int i = 0; i < 10; i++) {
            System.out.println(i +" "+ container1.getMass(i));
        }
        container1.delMass();
        System.out.println();
        for (int j = 0; j < 10; j++) {
            System.out.println(j +" "+ container1.getMass(j));
        }
    }
}

