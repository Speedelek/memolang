package com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_hungarian.generated;

import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_hungarian.EnglishHungarian;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.util.Optional;
import java.util.OptionalInt;

/**
 * The generated base for the {@link
 * com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_hungarian.EnglishHungarian}-interface
 * representing entities of the {@code english_hungarian}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedEnglishHungarian {
    
    /**
     * This Field corresponds to the {@link EnglishHungarian} field that can be
     * obtained using the {@link EnglishHungarian#getEnglishHungarianId()}
     * method.
     */
    IntField<EnglishHungarian, Integer> ENGLISH_HUNGARIAN_ID = IntField.create(
        Identifier.ENGLISH_HUNGARIAN_ID,
        EnglishHungarian::getEnglishHungarianId,
        EnglishHungarian::setEnglishHungarianId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link EnglishHungarian} field that can be
     * obtained using the {@link EnglishHungarian#getEnglishWordId()} method.
     */
    ComparableField<EnglishHungarian, Integer, Integer> ENGLISH_WORD_ID = ComparableField.create(
        Identifier.ENGLISH_WORD_ID,
        o -> OptionalUtil.unwrap(o.getEnglishWordId()),
        EnglishHungarian::setEnglishWordId,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link EnglishHungarian} field that can be
     * obtained using the {@link EnglishHungarian#getHungarianWordId()} method.
     */
    ComparableField<EnglishHungarian, Integer, Integer> HUNGARIAN_WORD_ID = ComparableField.create(
        Identifier.HUNGARIAN_WORD_ID,
        o -> OptionalUtil.unwrap(o.getHungarianWordId()),
        EnglishHungarian::setHungarianWordId,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link EnglishHungarian} field that can be
     * obtained using the {@link EnglishHungarian#getExampleSentence()} method.
     */
    StringField<EnglishHungarian, String> EXAMPLE_SENTENCE = StringField.create(
        Identifier.EXAMPLE_SENTENCE,
        o -> OptionalUtil.unwrap(o.getExampleSentence()),
        EnglishHungarian::setExampleSentence,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the englishHungarianId of this EnglishHungarian. The
     * englishHungarianId field corresponds to the database column
     * szakdogadb.szakdogadb.english_hungarian.english_hungarian_id.
     * 
     * @return the englishHungarianId of this EnglishHungarian
     */
    int getEnglishHungarianId();
    
    /**
     * Returns the englishWordId of this EnglishHungarian. The englishWordId
     * field corresponds to the database column
     * szakdogadb.szakdogadb.english_hungarian.english_word_id.
     * 
     * @return the englishWordId of this EnglishHungarian
     */
    OptionalInt getEnglishWordId();
    
    /**
     * Returns the hungarianWordId of this EnglishHungarian. The hungarianWordId
     * field corresponds to the database column
     * szakdogadb.szakdogadb.english_hungarian.hungarian_word_id.
     * 
     * @return the hungarianWordId of this EnglishHungarian
     */
    OptionalInt getHungarianWordId();
    
    /**
     * Returns the exampleSentence of this EnglishHungarian. The exampleSentence
     * field corresponds to the database column
     * szakdogadb.szakdogadb.english_hungarian.example_sentence.
     * 
     * @return the exampleSentence of this EnglishHungarian
     */
    Optional<String> getExampleSentence();
    
    /**
     * Sets the englishHungarianId of this EnglishHungarian. The
     * englishHungarianId field corresponds to the database column
     * szakdogadb.szakdogadb.english_hungarian.english_hungarian_id.
     * 
     * @param englishHungarianId to set of this EnglishHungarian
     * @return                   this EnglishHungarian instance
     */
    EnglishHungarian setEnglishHungarianId(int englishHungarianId);
    
    /**
     * Sets the englishWordId of this EnglishHungarian. The englishWordId field
     * corresponds to the database column
     * szakdogadb.szakdogadb.english_hungarian.english_word_id.
     * 
     * @param englishWordId to set of this EnglishHungarian
     * @return              this EnglishHungarian instance
     */
    EnglishHungarian setEnglishWordId(Integer englishWordId);
    
    /**
     * Sets the hungarianWordId of this EnglishHungarian. The hungarianWordId
     * field corresponds to the database column
     * szakdogadb.szakdogadb.english_hungarian.hungarian_word_id.
     * 
     * @param hungarianWordId to set of this EnglishHungarian
     * @return                this EnglishHungarian instance
     */
    EnglishHungarian setHungarianWordId(Integer hungarianWordId);
    
    /**
     * Sets the exampleSentence of this EnglishHungarian. The exampleSentence
     * field corresponds to the database column
     * szakdogadb.szakdogadb.english_hungarian.example_sentence.
     * 
     * @param exampleSentence to set of this EnglishHungarian
     * @return                this EnglishHungarian instance
     */
    EnglishHungarian setExampleSentence(String exampleSentence);
    
    enum Identifier implements ColumnIdentifier<EnglishHungarian> {
        
        ENGLISH_HUNGARIAN_ID ("english_hungarian_id"),
        ENGLISH_WORD_ID      ("english_word_id"),
        HUNGARIAN_WORD_ID    ("hungarian_word_id"),
        EXAMPLE_SENTENCE     ("example_sentence");
        
        private final String columnId;
        private final TableIdentifier<EnglishHungarian> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "szakdogadb";
        }
        
        @Override
        public String getSchemaId() {
            return "szakdogadb";
        }
        
        @Override
        public String getTableId() {
            return "english_hungarian";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<EnglishHungarian> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}