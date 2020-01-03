package com.example.memolang.games;

public class AllQuestionResult {
    private String questionedWord;
    private Integer result;

    public AllQuestionResult(String questionedWord, Integer result) {
        this.questionedWord = questionedWord;
        this.result = result;
    }

    public String getQuestionedWord() {
        return questionedWord;
    }

    public void setQuestionedWord(String questionedWord) {
        this.questionedWord = questionedWord;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
