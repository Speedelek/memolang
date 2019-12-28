package com.example.memolang.szakdogadb.szakdogadb.szakdogadb.users.generated;

import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.users.Users;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.users.UsersImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;
import static com.speedment.runtime.core.util.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link
 * com.example.memolang.szakdogadb.szakdogadb.szakdogadb.users.Users} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedUsersSqlAdapter implements SqlAdapter<Users> {
    
    private final TableIdentifier<Users> tableIdentifier;
    
    protected GeneratedUsersSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("szakdogadb", "szakdogadb", "users");
    }
    
    protected Users apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setId(          resultSet.getLong(1 + offset))
            .setActivation(  resultSet.getString(2 + offset))
            .setAddress(     resultSet.getString(3 + offset))
            .setBirthDate(   resultSet.getString(4 + offset))
            .setEmail(       resultSet.getString(5 + offset))
            .setEnabled(     getBoolean(resultSet, 6 + offset))
            .setFullname(    resultSet.getString(7 + offset))
            .setPassword(    resultSet.getString(8 + offset))
            .setPhoneNumber( resultSet.getString(9 + offset))
            .setRemark(      resultSet.getString(10 + offset))
            .setUsername(    resultSet.getString(11 + offset))
            ;
    }
    
    protected UsersImpl createEntity() {
        return new UsersImpl();
    }
    
    @Override
    public TableIdentifier<Users> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Users> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Users> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}