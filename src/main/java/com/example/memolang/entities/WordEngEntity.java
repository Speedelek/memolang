package com.example.memolang.entities;

import javax.persistence.*;

@Entity
@Table(name = "english_words")
public class WordEngEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "english_word_id")
    private int id;

    @Column(name = "english_word")
    private String engWord;

    @Column(name = "part_of_speech")
    private String partOfSpeech;

    @Column(name = "in_speech")
    private String inSpeech;

    @Column(name = "in_writing")
    private String inWriting;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEngWord() {
        return engWord;
    }

    public void setEngWord(String engWord) {
        this.engWord = engWord;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public String getInSpeech() {
        return inSpeech;
    }

    public void setInSpeech(String inSpeech) {
        this.inSpeech = inSpeech;
    }

    public String getInWriting() {
        return inWriting;
    }

    public void setInWriting(String inWriting) {
        this.inWriting = inWriting;
    }
}
