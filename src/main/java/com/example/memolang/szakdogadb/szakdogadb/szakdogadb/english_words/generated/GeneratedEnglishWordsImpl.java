package com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_words.generated;

import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_words.EnglishWords;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_words.EnglishWords}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedEnglishWordsImpl implements EnglishWords {
    
    private int englishWordId;
    private String englishWord;
    private String inSpeech;
    private String inWriting;
    private String partOfSpeech;
    
    protected GeneratedEnglishWordsImpl() {}
    
    @Override
    public int getEnglishWordId() {
        return englishWordId;
    }
    
    @Override
    public Optional<String> getEnglishWord() {
        return Optional.ofNullable(englishWord);
    }
    
    @Override
    public Optional<String> getInSpeech() {
        return Optional.ofNullable(inSpeech);
    }
    
    @Override
    public Optional<String> getInWriting() {
        return Optional.ofNullable(inWriting);
    }
    
    @Override
    public Optional<String> getPartOfSpeech() {
        return Optional.ofNullable(partOfSpeech);
    }
    
    @Override
    public EnglishWords setEnglishWordId(int englishWordId) {
        this.englishWordId = englishWordId;
        return this;
    }
    
    @Override
    public EnglishWords setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
        return this;
    }
    
    @Override
    public EnglishWords setInSpeech(String inSpeech) {
        this.inSpeech = inSpeech;
        return this;
    }
    
    @Override
    public EnglishWords setInWriting(String inWriting) {
        this.inWriting = inWriting;
        return this;
    }
    
    @Override
    public EnglishWords setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("englishWordId = " + Objects.toString(getEnglishWordId()));
        sj.add("englishWord = "   + Objects.toString(OptionalUtil.unwrap(getEnglishWord())));
        sj.add("inSpeech = "      + Objects.toString(OptionalUtil.unwrap(getInSpeech())));
        sj.add("inWriting = "     + Objects.toString(OptionalUtil.unwrap(getInWriting())));
        sj.add("partOfSpeech = "  + Objects.toString(OptionalUtil.unwrap(getPartOfSpeech())));
        return "EnglishWordsImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof EnglishWords)) { return false; }
        final EnglishWords thatEnglishWords = (EnglishWords)that;
        if (this.getEnglishWordId() != thatEnglishWords.getEnglishWordId()) { return false; }
        if (!Objects.equals(this.getEnglishWord(), thatEnglishWords.getEnglishWord())) { return false; }
        if (!Objects.equals(this.getInSpeech(), thatEnglishWords.getInSpeech())) { return false; }
        if (!Objects.equals(this.getInWriting(), thatEnglishWords.getInWriting())) { return false; }
        if (!Objects.equals(this.getPartOfSpeech(), thatEnglishWords.getPartOfSpeech())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getEnglishWordId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getEnglishWord()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getInSpeech()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getInWriting()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPartOfSpeech()));
        return hash;
    }
}