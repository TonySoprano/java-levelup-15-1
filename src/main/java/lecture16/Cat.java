package main.java.lecture16;

public class Cat {
    public static void main(String[] args) {

        Apple cat;
        cat = Apple.Lion;
//        cat = Apple.Puma;
        String result = "";
        if(cat == Apple.Lion){
            System.out.println("lion - " + cat);
        }
        switch (cat) {
            case Leopard:
                result = "Я леопард";
                break;
            case Puma:
                result = "Я пума";
                break;
            case Lion:
                result = "Я царь зверей";
                break;
            case Tiger:
                result = "Я тигра";
                break;
            case Manul:
                result = "Погладь кота, ...";
                break;
        }

        for(Apple c : Apple.values()) {
            System.out.println(c);
        }
        System.out.println();
        System.out.println(Apple.Tiger.ordinal());
        System.out.println();
        System.out.println(Apple.Tiger.compareTo(Apple.Puma));
        System.out.println(result);

    }
}
