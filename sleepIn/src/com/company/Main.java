package com.company;
import java.lang.System;
import java.util.Scanner;
import java.util.Objects;

public class Main {

    private static boolean canSleepIn(boolean isWeekend, boolean isVacation){
        return isWeekend || isVacation;
    }

    private static boolean stringToBool(String str){
        return Objects.equals(str, "y");
    }

    static private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    System.out.print("Is it a weekend? y or n: ");
	    String weekend = scanner.nextLine();

        System.out.print("Is it a vacation? y or n: ");
        String vacation = scanner.nextLine();

        if (canSleepIn(stringToBool(weekend),stringToBool(vacation))){
            System.out.println("You can sleep in");
        }
        else {
            System.out.println("You cannot sleep in :(");
        }
    }
}
