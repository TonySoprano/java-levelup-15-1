package main.java.lecture10;
/*Сделать класс, который будет считать сколько раз создавался его новый экземпляр.
 Для подсчета использовать конструкторы и статические поля класса.
 Должна присуствовать возможность получить текущее значение количества новых созданных объектов.
  */
public class Main {
    private static int count;

    public static void main(String[] args) {
       new Main();
       new Main();
       new Main();
        System.out.println(count);
    }

    public Main() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Main.count = count;
    }
}
