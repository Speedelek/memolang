package com.example.memolang.szakdogadb.szakdogadb.szakdogadb.hungarian_words.generated;

import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.hungarian_words.HungarianWords;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
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
    
    protected GeneratedHungarianWordsImpl() {}
    
    @Override
    public int getHungarianWordId() {
        return hungarianWordId;
    }
    
    @Override
    public Optional<String> getHungarianWord() {
        return Optional.ofNullable(hungarianWord);
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
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("hungarianWordId = " + Objects.toString(getHungarianWordId()));
        sj.add("hungarianWord = "   + Objects.toString(OptionalUtil.unwrap(getHungarianWord())));
        return "HungarianWordsImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof HungarianWords)) { return false; }
        final HungarianWords thatHungarianWords = (HungarianWords)that;
        if (this.getHungarianWordId() != thatHungarianWords.getHungarianWordId()) { return false; }
        if (!Objects.equals(this.getHungarianWord(), thatHungarianWords.getHungarianWord())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getHungarianWordId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getHungarianWord()));
        return hash;
    }
}