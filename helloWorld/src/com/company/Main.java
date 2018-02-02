package com.company;
import java.lang.System;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    private static final List<String> names = new ArrayList<>();
    private static final Scanner reader = new Scanner(System.in);

    private static void greet(String name){
        System.out.println("Greetings, " + name);
        if (names.size() > 0){
            System.out.print("I have also greeted: ");
            System.out.println(String.join(", ", names));
        }
        names.add(name);
    }

    public static void main(String[] args) {
        String usr = null;
        while (!Objects.equals(usr, "stop")){
            System.out.print("Name: ");
            usr = reader.nextLine();
            if (Objects.equals(usr, "stop")) {
                break;
            }
            greet(usr);
        }
    }
}
