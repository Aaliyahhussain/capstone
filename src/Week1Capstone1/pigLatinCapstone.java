package Week1Capstone1;

import java.util.Scanner;

public class pigLatinCapstone {

public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);


    final String vowels = "aeiouAEIOU";

    System.out.println("Welcome to the Pig Latin Translator!");
    System.out.println(" ");
    String answer;
    do {
        String beforeVowel = "";
        System.out.println("Enter a line to be translated: ");
        String word = scnr.nextLine();
        int cut = 0;
        while (cut < word.length() && !vowels.contains("" + word.charAt(cut))) {
            beforeVowel += word.charAt(cut);
            cut++;
        }
        if (cut == 0) {
            cut = 1;
            word += word.charAt(0) + "w";
        }
        System.out.println(word.substring(cut) + beforeVowel + "ay");
        System.out.println("Translate another line? (y/n)");
        answer = scnr.nextLine();

    } while (!answer.equalsIgnoreCase("n"));

    }

    }


