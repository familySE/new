//이렇게 편집을 하면 어떤 변화가 생길까요

package com.example.hangman;

public class Word {
    private int id;
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public Word(int id, String word) {
        this.id = id;
        this.word = word;
    }

    public int getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }
}
