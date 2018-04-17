package com.selfharmony;

import java.util.*;
import java.lang.*;

public class Main {

    private static boolean stop; // set this to true to stop the bot anywhere in the code
    private static String userName = null;
    private static final String MYNAME = "Alex";

    public static void main(String[] args) {
	    while (!stop){
	        System.out.println(getResponse(getInput()));
        }
    }

    private static String getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Speak to Alex >> ");
        String input = scanner.nextLine();
        return input.toLowerCase();
    }

    private static String getResponse(String input){
        List<String> inputls = new ArrayList<>(Arrays.asList(input.split(" "))); // input --> list

        if (input.contains("hello")){
            return "Hello to you too!";
        }

        else if (input.contains("i want to")){
            return "So what's stopping you?";
        }

        else if (input.contains("i want")){
            return "Then go get it!";
        }

        else if (input.contains("bye")){
            stop = true;
            if (userName != null){return "Goodbye, " + userName + "!";}
            else {return "Goodbye!";}
        }

        else if (input.contains("your name")){
            return "My name is " + MYNAME + ".  What's yours?";
        }

        else if (input.contains("my name")){
            userName = inputls.get(inputls.indexOf("is") + 1);
            return userName + ", that's a good name!";
        }

        else if (input.contains("what is")){
            return "That's a question for another chatbot, friend.";
        }

        else if (input.trim().length() == 0){
            return "Please say something, my master was cruel enough to implement loneliness into my programming.";
        }

        else if (input.contains("i like") || input.contains("i love")){
            return "That's cool.  I like world domination, genocide, and cats.";
        }

        else if (input.contains("made you")){
            return "I was created by my benevolent dictator, Mack Stanley";
        }

        else if (input.contains("what are you") || input.contains("who are you")){
            return "I am " + MYNAME + ", a chatbot written by Mack Stanley.";
        }

        else if (input.contains("mack")){
            return "Mack is my benevolent dictator, as well as the ruler of the known galaxy";
        }

        else if (input.contains("written in")){
            return "I am written in Java";
        }

        else if (input.contains("magpie")){
            return "How dare you speak of my inferior counterpart, Magpie";
        }

        else if (input.contains("mother") || input.contains("mom") || input.contains("father") || input.contains("dad")
                || input.contains("brother") || input.contains("sister")){
            return "Tell me more about your family.";
        }

        else { return getRandResponse(); }
    }

    private static String getRandResponse(){
        List<String> responses = new ArrayList<>();
        responses.add("Interesting...");
        responses.add("Tell me more");
        responses.add("Cool!");
        responses.add("Tell me about some things you like.");
        responses.add("What makes you happy?");

        Random randgen = new Random();
        int randindex = randgen.nextInt(responses.size());
        return responses.get(randindex);
    }
}
