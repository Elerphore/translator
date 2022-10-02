package ru.lu.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Word {
    @JsonProperty("word")
    private String word;

    @JsonProperty("translate")
    private String translate;

    private Boolean rightWord = false;

    public Word(String word, String translate) {
        this.word = word;
        this.translate = translate;
    }

    public Word() {
    }

    @Override
    public String toString() {
        return "{\"word\": "+ this.word + ", \"translator\": " + this.translate + " \"right\": " + this.rightWord + "}";
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }

    public String getWord() {
        return word;
    }

    public Boolean getRightWord() {
        return rightWord;
    }

    public void setRightWord(Boolean rightWord) {
        this.rightWord = rightWord;
    }
}
