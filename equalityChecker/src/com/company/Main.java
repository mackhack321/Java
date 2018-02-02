package com.company;
import java.lang.System;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static boolean check(String v1, String v2){
        return Objects.equals(v1, v2);
    }

    public static void main(String[] args) {
        System.out.print("Give the first value: ");
        String value1 = scanner.nextLine();
        System.out.print("Give the second value: ");
        String value2 = scanner.nextLine();
        if (check(value1,value2)){
            System.out.println("The values are equal");
        }
        else{
            System.out.println("The values are not equal");
        }
    }
}
