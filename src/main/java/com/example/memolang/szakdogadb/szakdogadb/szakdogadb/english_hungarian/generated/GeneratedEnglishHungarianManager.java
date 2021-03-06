package com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_hungarian.generated;

import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_hungarian.EnglishHungarian;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_hungarian.EnglishHungarian}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedEnglishHungarianManager extends Manager<EnglishHungarian> {
    
    TableIdentifier<EnglishHungarian> IDENTIFIER = TableIdentifier.of("szakdogadb", "szakdogadb", "english_hungarian");
    List<Field<EnglishHungarian>> FIELDS = unmodifiableList(asList(
        EnglishHungarian.ENGLISH_HUNGARIAN_ID,
        EnglishHungarian.ENGLISH_WORD_ID,
        EnglishHungarian.HUNGARIAN_WORD_ID,
        EnglishHungarian.EXAMPLE_SENTENCE
    ));
    
    @Override
    default Class<EnglishHungarian> getEntityClass() {
        return EnglishHungarian.class;
    }
}