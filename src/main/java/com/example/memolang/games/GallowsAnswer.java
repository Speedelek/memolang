package com.example.memolang.games;

import java.util.ArrayList;

public class GallowsAnswer {

    private Integer questionedWordId;
    private String questionedWord;
    private Integer questionedWordLength;
    private String answer;
    private Integer counter;
    private String strokes;
    private Integer guessedLetters;
    private Integer misses;
    private ArrayList<String> alphabetA;

    public GallowsAnswer(Integer questionedWordId, String questionedWord,Integer questionedWordLength, Integer counter, String strokes, Integer guessedLetters, Integer misses, ArrayList<String>alphabetA) {
        this.questionedWordId = questionedWordId;
        this.questionedWord = questionedWord;
        this.questionedWordLength = questionedWordLength;
        this.counter = counter;
        this.strokes = strokes;
        this.guessedLetters = guessedLetters;
        this.misses = misses;
        this.alphabetA = alphabetA;
    }

    public GallowsAnswer(){

    }

    public ArrayList<String> getAlphabetA() {
        return alphabetA;
    }

    public void setAlphabetA(ArrayList<String> alphabetA) {
        this.alphabetA = alphabetA;
    }

    public Integer getQuestionedWordLength() {
        return questionedWordLength;
    }

    public void setQuestionedWordLength(Integer questionedWordLength) {
        this.questionedWordLength = questionedWordLength;
    }

    public Integer getMisses() {
        return misses;
    }

    public void setMisses(Integer misses) {
        this.misses = misses;
    }

    public Integer getQuestionedWordId() {
        return questionedWordId;
    }

    public void setQuestionedWordId(Integer questionedWordId) {
        this.questionedWordId = questionedWordId;
    }

    public String getQuestionedWord() {
        return questionedWord;
    }

    public void setQuestionedWord(String questionedWord) {
        this.questionedWord = questionedWord;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public String getStrokes() {
        return strokes;
    }

    public void setStrokes(String strokes) {
        this.strokes = strokes;
    }

    public Integer getGuessedLetters() {
        return guessedLetters;
    }

    public void setGuessedLetters(Integer guessedLetters) {
        this.guessedLetters = guessedLetters;
    }
}
