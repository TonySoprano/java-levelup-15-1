package main.java.lecture13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    //    public static Comand<String> container = new Comand<String>();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите запрос: ");
        String number = reader.readLine();
        String[] s = number.split(" ");
        ArrayList<Comand> list = new ArrayList<Comand>();
        list.add(new Ls());
        list.add(new Mv());
        list.add(new TRm());
        for (Comand i : list) {
            if (i.check(s[0])) {
                System.out.println(i.comand(number));
            }
        }

    }
}

