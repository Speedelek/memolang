package com.example.memolang.szakdogadb.szakdogadb.szakdogadb.hibernate_sequences.generated;

import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.hibernate_sequences.HibernateSequences;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.OptionalLong;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.example.memolang.szakdogadb.szakdogadb.szakdogadb.hibernate_sequences.HibernateSequences}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedHibernateSequencesImpl implements HibernateSequences {
    
    private String sequenceName;
    private Long nextVal;
    
    protected GeneratedHibernateSequencesImpl() {}
    
    @Override
    public String getSequenceName() {
        return sequenceName;
    }
    
    @Override
    public OptionalLong getNextVal() {
        return OptionalUtil.ofNullable(nextVal);
    }
    
    @Override
    public HibernateSequences setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName;
        return this;
    }
    
    @Override
    public HibernateSequences setNextVal(Long nextVal) {
        this.nextVal = nextVal;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("sequenceName = " + Objects.toString(getSequenceName()));
        sj.add("nextVal = "      + Objects.toString(OptionalUtil.unwrap(getNextVal())));
        return "HibernateSequencesImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof HibernateSequences)) { return false; }
        final HibernateSequences thatHibernateSequences = (HibernateSequences)that;
        if (!Objects.equals(this.getSequenceName(), thatHibernateSequences.getSequenceName())) { return false; }
        if (!Objects.equals(this.getNextVal(), thatHibernateSequences.getNextVal())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(getSequenceName());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getNextVal()));
        return hash;
    }
}