package ru.lu.translator;

import ru.lu.data.Word;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleManager {
    public static void outWords(Word... words) {

        var trueWord = Arrays.stream(words).filter(Word::getRightWord).findFirst().get();
        System.out.println("Word " + trueWord.getWord() + " means: ");

        var index = 1;
        for(Word word : words) {
            System.out.println(index + ") " + word.getTranslate());
            index++;
        }

    }

    public static void getAnswer(Word... words) {
        var trueWord = Arrays.stream(words).filter(Word::getRightWord).findFirst().get();

        Scanner in = new Scanner(System.in);
        int answer = in.nextInt();

        if(words[answer - 1].getTranslate().equals(trueWord.getTranslate())) {
            System.out.println("Your answer " + answer + " is right!\n");
        } else {
            System.out.println("Your answer " + answer + " is wrong!\n");
        }
    }
}
