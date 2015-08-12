package main.java.lecture13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static Comand<String> container = new Comand<String>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        container.addMass(reader.readLine());

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i +" "+ container.getMass(i));
//        }
//        container.delMass();
//
//        System.out.println();
//        for (int j = 0; j < 10; j++) {
//            System.out.println(j +" "+ container.getMass(j));
//        }
    }
}