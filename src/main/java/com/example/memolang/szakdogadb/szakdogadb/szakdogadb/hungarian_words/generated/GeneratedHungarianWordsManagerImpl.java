package com.example.memolang.szakdogadb.szakdogadb.szakdogadb.hungarian_words.generated;

import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.hungarian_words.HungarianWords;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.hungarian_words.HungarianWordsImpl;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.hungarian_words.HungarianWordsManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.example.memolang.szakdogadb.szakdogadb.szakdogadb.hungarian_words.HungarianWords}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedHungarianWordsManagerImpl 
extends AbstractManager<HungarianWords> 
implements GeneratedHungarianWordsManager {
    
    private final TableIdentifier<HungarianWords> tableIdentifier;
    
    protected GeneratedHungarianWordsManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("szakdogadb", "szakdogadb", "hungarian_words");
    }
    
    @Override
    public HungarianWords create() {
        return new HungarianWordsImpl();
    }
    
    @Override
    public TableIdentifier<HungarianWords> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<HungarianWords>> fields() {
        return HungarianWordsManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<HungarianWords>> primaryKeyFields() {
        return Stream.of(
            HungarianWords.HUNGARIAN_WORD_ID
        );
    }
}