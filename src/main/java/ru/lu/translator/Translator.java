package ru.lu.translator;

import java.util.Random;

public class Translator {
    private final Random random = new Random();

    public void main() {
        while(true) {
            var words = WordManager.readJsonFile();

            var trueWord = words[random.nextInt(words.length - 1)];
            trueWord.setRightWord(true);

            var fakeOne = words[random.nextInt(words.length - 1)];
            var fakeTwo = words[random.nextInt(words.length - 1)];

            ConsoleManager.outWords(trueWord, fakeOne, fakeTwo);
            ConsoleManager.getAnswer(trueWord, fakeOne, fakeTwo);
        }
    }
}
