package com.example.memolang.games;

public class SimpleAnswer {

    private Integer questionedWordId;
    private String questionedWord;
    private String answer;
    private Integer counter;
    private Integer result;

    /*public SimpleAnswer(Integer counter) {
        this.counter = counter;
    }

    public SimpleAnswer(Integer questionedWordId, Integer counter) {
        this.questionedWordId = questionedWordId;
        this.counter = counter;
    }*/

    public SimpleAnswer(Integer questionedWordId, String questionedWord, Integer counter) {
        this.questionedWordId = questionedWordId;
        this.questionedWord = questionedWord;
        this.counter = counter;
    }

    public SimpleAnswer(){

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

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
