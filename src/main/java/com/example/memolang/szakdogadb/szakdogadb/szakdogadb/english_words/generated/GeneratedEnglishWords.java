package com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_words.generated;

import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_words.EnglishWords;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.util.Optional;

/**
 * The generated base for the {@link
 * com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_words.EnglishWords}-interface
 * representing entities of the {@code english_words}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedEnglishWords {
    
    /**
     * This Field corresponds to the {@link EnglishWords} field that can be
     * obtained using the {@link EnglishWords#getEnglishWordId()} method.
     */
    IntField<EnglishWords, Integer> ENGLISH_WORD_ID = IntField.create(
        Identifier.ENGLISH_WORD_ID,
        EnglishWords::getEnglishWordId,
        EnglishWords::setEnglishWordId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link EnglishWords} field that can be
     * obtained using the {@link EnglishWords#getEnglishWord()} method.
     */
    StringField<EnglishWords, String> ENGLISH_WORD = StringField.create(
        Identifier.ENGLISH_WORD,
        EnglishWords::getEnglishWord,
        EnglishWords::setEnglishWord,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link EnglishWords} field that can be
     * obtained using the {@link EnglishWords#getInSpeech()} method.
     */
    StringField<EnglishWords, String> IN_SPEECH = StringField.create(
        Identifier.IN_SPEECH,
        o -> OptionalUtil.unwrap(o.getInSpeech()),
        EnglishWords::setInSpeech,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link EnglishWords} field that can be
     * obtained using the {@link EnglishWords#getInWriting()} method.
     */
    StringField<EnglishWords, String> IN_WRITING = StringField.create(
        Identifier.IN_WRITING,
        o -> OptionalUtil.unwrap(o.getInWriting()),
        EnglishWords::setInWriting,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link EnglishWords} field that can be
     * obtained using the {@link EnglishWords#getPartOfSpeech()} method.
     */
    StringField<EnglishWords, String> PART_OF_SPEECH = StringField.create(
        Identifier.PART_OF_SPEECH,
        EnglishWords::getPartOfSpeech,
        EnglishWords::setPartOfSpeech,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the englishWordId of this EnglishWords. The englishWordId field
     * corresponds to the database column
     * szakdogadb.szakdogadb.english_words.english_word_id.
     * 
     * @return the englishWordId of this EnglishWords
     */
    int getEnglishWordId();
    
    /**
     * Returns the englishWord of this EnglishWords. The englishWord field
     * corresponds to the database column
     * szakdogadb.szakdogadb.english_words.english_word.
     * 
     * @return the englishWord of this EnglishWords
     */
    String getEnglishWord();
    
    /**
     * Returns the inSpeech of this EnglishWords. The inSpeech field corresponds
     * to the database column szakdogadb.szakdogadb.english_words.in_speech.
     * 
     * @return the inSpeech of this EnglishWords
     */
    Optional<String> getInSpeech();
    
    /**
     * Returns the inWriting of this EnglishWords. The inWriting field
     * corresponds to the database column
     * szakdogadb.szakdogadb.english_words.in_writing.
     * 
     * @return the inWriting of this EnglishWords
     */
    Optional<String> getInWriting();
    
    /**
     * Returns the partOfSpeech of this EnglishWords. The partOfSpeech field
     * corresponds to the database column
     * szakdogadb.szakdogadb.english_words.part_of_speech.
     * 
     * @return the partOfSpeech of this EnglishWords
     */
    String getPartOfSpeech();
    
    /**
     * Sets the englishWordId of this EnglishWords. The englishWordId field
     * corresponds to the database column
     * szakdogadb.szakdogadb.english_words.english_word_id.
     * 
     * @param englishWordId to set of this EnglishWords
     * @return              this EnglishWords instance
     */
    EnglishWords setEnglishWordId(int englishWordId);
    
    /**
     * Sets the englishWord of this EnglishWords. The englishWord field
     * corresponds to the database column
     * szakdogadb.szakdogadb.english_words.english_word.
     * 
     * @param englishWord to set of this EnglishWords
     * @return            this EnglishWords instance
     */
    EnglishWords setEnglishWord(String englishWord);
    
    /**
     * Sets the inSpeech of this EnglishWords. The inSpeech field corresponds to
     * the database column szakdogadb.szakdogadb.english_words.in_speech.
     * 
     * @param inSpeech to set of this EnglishWords
     * @return         this EnglishWords instance
     */
    EnglishWords setInSpeech(String inSpeech);
    
    /**
     * Sets the inWriting of this EnglishWords. The inWriting field corresponds
     * to the database column szakdogadb.szakdogadb.english_words.in_writing.
     * 
     * @param inWriting to set of this EnglishWords
     * @return          this EnglishWords instance
     */
    EnglishWords setInWriting(String inWriting);
    
    /**
     * Sets the partOfSpeech of this EnglishWords. The partOfSpeech field
     * corresponds to the database column
     * szakdogadb.szakdogadb.english_words.part_of_speech.
     * 
     * @param partOfSpeech to set of this EnglishWords
     * @return             this EnglishWords instance
     */
    EnglishWords setPartOfSpeech(String partOfSpeech);
    
    enum Identifier implements ColumnIdentifier<EnglishWords> {
        
        ENGLISH_WORD_ID ("english_word_id"),
        ENGLISH_WORD    ("english_word"),
        IN_SPEECH       ("in_speech"),
        IN_WRITING      ("in_writing"),
        PART_OF_SPEECH  ("part_of_speech");
        
        private final String columnId;
        private final TableIdentifier<EnglishWords> tableIdentifier;
        
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
            return "english_words";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<EnglishWords> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}