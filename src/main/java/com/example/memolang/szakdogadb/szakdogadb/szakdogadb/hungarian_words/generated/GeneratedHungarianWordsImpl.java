package com.example.memolang.szakdogadb.szakdogadb.szakdogadb.hungarian_words.generated;

import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.hungarian_words.HungarianWords;
import com.speedment.common.annotation.GeneratedCode;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.example.memolang.szakdogadb.szakdogadb.szakdogadb.hungarian_words.HungarianWords}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedHungarianWordsImpl implements HungarianWords {
    
    private int hungarianWordId;
    private String hungarianWord;
    private String hungarianWordscol;
    
    protected GeneratedHungarianWordsImpl() {}
    
    @Override
    public int getHungarianWordId() {
        return hungarianWordId;
    }
    
    @Override
    public String getHungarianWord() {
        return hungarianWord;
    }
    
    @Override
    public String getHungarianWordscol() {
        return hungarianWordscol;
    }
    
    @Override
    public HungarianWords setHungarianWordId(int hungarianWordId) {
        this.hungarianWordId = hungarianWordId;
        return this;
    }
    
    @Override
    public HungarianWords setHungarianWord(String hungarianWord) {
        this.hungarianWord = hungarianWord;
        return this;
    }
    
    @Override
    public HungarianWords setHungarianWordscol(String hungarianWordscol) {
        this.hungarianWordscol = hungarianWordscol;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("hungarianWordId = "   + Objects.toString(getHungarianWordId()));
        sj.add("hungarianWord = "     + Objects.toString(getHungarianWord()));
        sj.add("hungarianWordscol = " + Objects.toString(getHungarianWordscol()));
        return "HungarianWordsImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof HungarianWords)) { return false; }
        final HungarianWords thatHungarianWords = (HungarianWords)that;
        if (this.getHungarianWordId() != thatHungarianWords.getHungarianWordId()) { return false; }
        if (!Objects.equals(this.getHungarianWord(), thatHungarianWords.getHungarianWord())) { return false; }
        if (!Objects.equals(this.getHungarianWordscol(), thatHungarianWords.getHungarianWordscol())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getHungarianWordId());
        hash = 31 * hash + Objects.hashCode(getHungarianWord());
        hash = 31 * hash + Objects.hashCode(getHungarianWordscol());
        return hash;
    }
}