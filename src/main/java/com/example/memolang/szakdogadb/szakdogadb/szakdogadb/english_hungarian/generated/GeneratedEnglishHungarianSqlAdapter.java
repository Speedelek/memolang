package com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_hungarian.generated;

import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_hungarian.EnglishHungarian;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_hungarian.EnglishHungarianImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_hungarian.EnglishHungarian}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedEnglishHungarianSqlAdapter implements SqlAdapter<EnglishHungarian> {
    
    private final TableIdentifier<EnglishHungarian> tableIdentifier;
    
    protected GeneratedEnglishHungarianSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("szakdogadb", "szakdogadb", "english_hungarian");
    }
    
    protected EnglishHungarian apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setEnglishHungarianId( resultSet.getInt(1 + offset))
            .setEnglishWordId(      resultSet.getInt(2 + offset))
            .setHungarianWordId(    resultSet.getInt(3 + offset))
            .setExampleSentence(    resultSet.getString(4 + offset))
            ;
    }
    
    protected EnglishHungarianImpl createEntity() {
        return new EnglishHungarianImpl();
    }
    
    @Override
    public TableIdentifier<EnglishHungarian> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, EnglishHungarian> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, EnglishHungarian> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}