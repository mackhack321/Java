package com.company;
import java.lang.System;
import java.util.Scanner;
import java.util.Objects;

public class Main {

    private static final String[][] movies = {
            {"MovieOne","The first movie"},
            {"MovieTwo","The second movie"},
            {"MovieThree","The third movie"}
    };

    private static final Scanner scanner = new Scanner(System.in);

    private static int getIndex(String input){
        for (int i = 0; i < movies.length; i++){
            if (Objects.equals(input,movies[i][0])){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.print("Give the movie you want the description to: ");
        String usrInput = scanner.nextLine();
        System.out.println(movies[getIndex(usrInput)][1]);
        System.out.print("Update description of a movie? y or n: ");
        String updateCheck = scanner.nextLine();
        if (Objects.equals(updateCheck.toLowerCase(),"y")) {
            System.out.print("Movie to edit: ");
            String usrmovie = scanner.nextLine();
            System.out.print("New description: ");
            String newdesc = scanner.nextLine();
            movies[getIndex(usrmovie)][1] = newdesc;
            System.out.println(movies[getIndex(usrmovie)][1]);
        }
    }
}
