package com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_hungarian.generated;

import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_hungarian.EnglishHungarian;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_hungarian.EnglishHungarian}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedEnglishHungarianImpl implements EnglishHungarian {
    
    private int englishHungarianId;
    private Integer englishWordId;
    private Integer hungarianWordId;
    private String exampleSentence;
    
    protected GeneratedEnglishHungarianImpl() {}
    
    @Override
    public int getEnglishHungarianId() {
        return englishHungarianId;
    }
    
    @Override
    public OptionalInt getEnglishWordId() {
        return OptionalUtil.ofNullable(englishWordId);
    }
    
    @Override
    public OptionalInt getHungarianWordId() {
        return OptionalUtil.ofNullable(hungarianWordId);
    }
    
    @Override
    public Optional<String> getExampleSentence() {
        return Optional.ofNullable(exampleSentence);
    }
    
    @Override
    public EnglishHungarian setEnglishHungarianId(int englishHungarianId) {
        this.englishHungarianId = englishHungarianId;
        return this;
    }
    
    @Override
    public EnglishHungarian setEnglishWordId(Integer englishWordId) {
        this.englishWordId = englishWordId;
        return this;
    }
    
    @Override
    public EnglishHungarian setHungarianWordId(Integer hungarianWordId) {
        this.hungarianWordId = hungarianWordId;
        return this;
    }
    
    @Override
    public EnglishHungarian setExampleSentence(String exampleSentence) {
        this.exampleSentence = exampleSentence;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("englishHungarianId = " + Objects.toString(getEnglishHungarianId()));
        sj.add("englishWordId = "      + Objects.toString(OptionalUtil.unwrap(getEnglishWordId())));
        sj.add("hungarianWordId = "    + Objects.toString(OptionalUtil.unwrap(getHungarianWordId())));
        sj.add("exampleSentence = "    + Objects.toString(OptionalUtil.unwrap(getExampleSentence())));
        return "EnglishHungarianImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof EnglishHungarian)) { return false; }
        final EnglishHungarian thatEnglishHungarian = (EnglishHungarian)that;
        if (this.getEnglishHungarianId() != thatEnglishHungarian.getEnglishHungarianId()) { return false; }
        if (!Objects.equals(this.getEnglishWordId(), thatEnglishHungarian.getEnglishWordId())) { return false; }
        if (!Objects.equals(this.getHungarianWordId(), thatEnglishHungarian.getHungarianWordId())) { return false; }
        if (!Objects.equals(this.getExampleSentence(), thatEnglishHungarian.getExampleSentence())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getEnglishHungarianId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getEnglishWordId()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getHungarianWordId()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getExampleSentence()));
        return hash;
    }
}