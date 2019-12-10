package com.example.memolang.entities;

import javax.persistence.*;

@Entity
@Table(name = "english_hungarian")
public class WordEnglishHungarianEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "english_word_id")
    Integer englishWordId;

    @Column(name = "hungarian_word_id")
    Integer hungarianWordId;

    @Column(name = "example_sentence")
    String exampleSentence;

    public WordEnglishHungarianEntity(Integer englishWordId, Integer hungarianWordId, String exampleSentence) {
        this.englishWordId = englishWordId;
        this.hungarianWordId = hungarianWordId;
        this.exampleSentence = exampleSentence;
    }

    public WordEnglishHungarianEntity(){

    }

    public Integer getEnglishWordId() {
        return englishWordId;
    }

    public void setEnglishWordId(Integer englishWordId) {
        this.englishWordId = englishWordId;
    }

    public Integer getHungarianWordId() {
        return hungarianWordId;
    }

    public void setHungarianWordId(Integer hungarianWordId) {
        this.hungarianWordId = hungarianWordId;
    }

    public String getExampleSentence() {
        return exampleSentence;
    }

    public void setExampleSentence(String exampleSentence) {
        this.exampleSentence = exampleSentence;
    }

}
